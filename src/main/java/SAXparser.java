import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.HashMap;

public class SAXparser {

    public static void main(String argv[]) {
        parseTranscriptUsingSAX();

    }

    private static void parseTranscriptUsingSAX()
    {
        try
        {
            SAXParserFactory saxpf = SAXParserFactory.newInstance();
            SAXParser saxp = saxpf.newSAXParser();

            saxp.parse("src/main/resources/input/Transcript.xml", new SAXTranscriptParser());

        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    /**
     * Handler for parsing Transcript.xml.
     * */
    static class SAXTranscriptParser extends DefaultHandler
    {
        HashMap<String, String> generalInfo = new HashMap<>();

        HashMap<String, HashMap<String, String>> courseMap = new HashMap<>();

        String currentKey;

        int courseCount;
        int gradeCount;

        boolean isCourse;

        HashMap<String, String> currentCourse = new HashMap<>();


        public SAXTranscriptParser()
        {
        }


        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
        {
            if (qName.equals("t:University"))
            {
                currentKey = qName;
            }
            else if (qName.equals("t:Degree"))
            {
                currentKey = qName;
            }
            else if (qName.equals("t:Year"))
            {
                currentKey = qName;
            }
            else if (qName.equals("t:Course"))
            {
                isCourse = true;
            }
            else if (isCourse)
            {
                currentKey = qName;
            }
        }


        @Override
        public void characters(char[] ch, int start, int length) throws SAXException
        {
            String content = new String(ch, start, length);
            if (currentKey != null && currentKey.isEmpty() == false && isCourse == false)
            {
                generalInfo.put(currentKey, content);
            }
            else if (currentKey != null && currentKey.isEmpty() == false && isCourse)
            {
                currentCourse.put(currentKey, content);
            }
            currentKey = null;
        }


        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException
        {
            if (qName.equals("t:Course"))
            {
                courseMap.put(currentCourse.get("t:Name"), new HashMap<>(currentCourse));
                currentCourse.clear();
                isCourse = false;
            }
        }


        @Override
        public void startDocument() throws SAXException
        {
        }


        @Override
        public void endDocument() throws SAXException
        {
            try
            {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

                DocumentBuilder builder = factory.newDocumentBuilder();

                Document output = builder.newDocument();

                Element rootNode = output.createElementNS("http://www.kth.se/applicationprofile", "ap:StudiesInfo");

                Element universityElement = output.createElement("ap:University");
                universityElement.appendChild(output.createTextNode(generalInfo.get("t:University")));
                rootNode.appendChild(universityElement);

                Element degreeElement = output.createElement("ap:Degree");
                degreeElement.appendChild(output.createTextNode(generalInfo.get("t:Degree")));
                rootNode.appendChild(degreeElement);

                Element yearElement = output.createElement("ap:Year");
                yearElement.appendChild(output.createTextNode(generalInfo.get("t:Year")));
                rootNode.appendChild(yearElement);

                int gradeSum = 0;
                for (HashMap<String, String> course : courseMap.values())
                {
                    String grade = course.get("t:Grade");
                    int gradeAsInteger = Integer.parseInt(grade);
                    gradeSum += gradeAsInteger;
                }

                int GPA = gradeSum / courseMap.size();

                Element GPAElement = output.createElement("ap:GPA");
                GPAElement.appendChild(output.createTextNode(String.valueOf(GPA)));
                rootNode.appendChild(GPAElement);

                Element coursesElement = output.createElement("ap:Courses");

                for (HashMap<String, String> course : courseMap.values())
                {
                    Element courseElement = output.createElement("ap:Course");

                    Element nameElement = output.createElement("ap:Name");
                    nameElement.appendChild(output.createTextNode(course.get("t:Name")));
                    courseElement.appendChild(nameElement);

                    Element codeElement = output.createElement("ap:Code");
                    codeElement.appendChild(output.createTextNode(course.get("t:Code")));
                    courseElement.appendChild(codeElement);

                    Element gradeElement = output.createElement("ap:Grade");
                    gradeElement.appendChild(output.createTextNode(course.get("t:Grade")));
                    courseElement.appendChild(gradeElement);

                    coursesElement.appendChild(courseElement);
                }

                rootNode.appendChild(coursesElement);

                output.appendChild(rootNode);

                DOMSource source = new DOMSource(output);

                StreamResult result = new StreamResult(new File("src/main/resources/processed/SAXparsed.xml"));

                TransformerFactory transformerFactory = TransformerFactory.newInstance();

                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
                transformer.transform(source, result);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

}
