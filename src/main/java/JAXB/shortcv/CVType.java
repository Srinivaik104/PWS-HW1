
package JAXB.shortcv;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CVType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CVType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PersonNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CVType", namespace = "http://www.svenskqa.se", propOrder = {
    "firstName",
    "lastName",
    "personNumber"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:10:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class CVType {

    @XmlElement(name = "FirstName", namespace = "http://www.svenskqa.se", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:10:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String firstName;
    @XmlElement(name = "LastName", namespace = "http://www.svenskqa.se", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:10:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String lastName;
    @XmlElement(name = "PersonNumber", namespace = "http://www.svenskqa.se", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:10:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String personNumber;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:10:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:10:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:10:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:10:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the personNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:10:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPersonNumber() {
        return personNumber;
    }

    /**
     * Sets the value of the personNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:10:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPersonNumber(String value) {
        this.personNumber = value;
    }

}
