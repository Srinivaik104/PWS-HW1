import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;

public class DOMparser {

    public static void main(String argv[]) {
    DOMparser();

    }

    public static void DOMparser(){
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setValidating(true);
            factory.setNamespaceAware(true);
            factory.setIgnoringElementContentWhitespace(true);
            factory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaLanguage",
                    "http://www.w3.org/2001/XMLSchema");
            factory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaSource", "ShortCv.xsd");

            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("src/main/resources/input/ShortCv.xml"));

            //Start from first child node
            Node root = document.getFirstChild();
            String firstName = getNodeValue(root.getChildNodes(), "cv:FirstName");
            String lastName = getNodeValue(root.getChildNodes(), "cv:LastName");
            String personNumber = getNodeValue(root.getChildNodes(), "cv:PersonNumber");

            Document output = builder.newDocument();
            Element rootNode = output.createElementNS("http://www.kth.se/applicationprofile", "ap:GeneralInfo");

            Element firstNameElement = output.createElement("ap:FirstName");
            firstNameElement.appendChild(output.createTextNode(firstName));

            Element lastNameElement = output.createElement("ap:LastName");
            lastNameElement.appendChild(output.createTextNode(lastName));

            Element personNumberElement = output.createElement("ap:PersonNumber");
            personNumberElement.appendChild(output.createTextNode(personNumber));

            rootNode.appendChild(firstNameElement);
            rootNode.appendChild(lastNameElement);
            rootNode.appendChild(personNumberElement);
            output.appendChild(rootNode);

            DOMSource source = new DOMSource(output);

            StreamResult result = new StreamResult(new File("src/main/resources/processed/DOMparsed.xml"));

            TransformerFactory transformerFactory = TransformerFactory.newInstance();

            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            transformer.transform(source, result);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }



    /**
     * Helper for DOM parsing.
     * */
    private static String getNodeValue(NodeList nodes, String nodeName)
    {
        Node result = findNode(nodes, nodeName);
        if (result != null)
        {
            return result.getFirstChild().getNodeValue();
        }
        return null;
    }

    /**
     * Helper for DOM parsing.
     * */
    private static Node findNode(NodeList nodes, String nodeName)
    {
        for (int i = 0; i < nodes.getLength(); i++)
        {
            if (nodes.item(i).getNodeName().equals(nodeName))
            {
                return nodes.item(i);
            }
        }
        return null;
    }




}
