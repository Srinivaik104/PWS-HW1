
package JAXB.company;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="PayPal"/>
 *               &lt;enumeration value="Gamestop"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CompanyNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="01"/>
 *               &lt;enumeration value="02"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PhoneNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="077777777"/>
 *               &lt;enumeration value="0888888888"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="JobType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Permanent"/>
 *               &lt;enumeration value="Temporary"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyType", namespace = "http://www.svenskqa.se", propOrder = {
    "name",
    "companyNumber",
    "phoneNumber",
    "jobType"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:05:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class CompanyType {

    @XmlElement(name = "Name", namespace = "http://www.svenskqa.se", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:05:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String name;
    @XmlElement(name = "CompanyNumber", namespace = "http://www.svenskqa.se", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:05:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String companyNumber;
    @XmlElement(name = "PhoneNumber", namespace = "http://www.svenskqa.se", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:05:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String phoneNumber;
    @XmlElement(name = "JobType", namespace = "http://www.svenskqa.se", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:05:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String jobType;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:05:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:05:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the companyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:05:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCompanyNumber() {
        return companyNumber;
    }

    /**
     * Sets the value of the companyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:05:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCompanyNumber(String value) {
        this.companyNumber = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:05:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:05:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the jobType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:05:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:05:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setJobType(String value) {
        this.jobType = value;
    }

}
