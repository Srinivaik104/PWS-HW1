
package JAXB.company;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hw1.javaobjects package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Companies_QNAME = new QName("http://www.svenskqa.se", "Companies");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hw1.javaobjects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompaniesType }
     * 
     */
    public CompaniesType createCompaniesType() {
        return new CompaniesType();
    }

    /**
     * Create an instance of {@link CompanyType }
     * 
     */
    public CompanyType createCompanyType() {
        return new CompanyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompaniesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.svenskqa.se", name = "Companies")
    public JAXBElement<CompaniesType> createCompanies(CompaniesType value) {
        return new JAXBElement<CompaniesType>(_Companies_QNAME, CompaniesType.class, null, value);
    }

}
