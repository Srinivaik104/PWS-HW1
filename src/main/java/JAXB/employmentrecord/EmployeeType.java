
package JAXB.employmentrecord;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PersonNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Employment" type="{http://www.EmploymentInfo.se}EmploymentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeType", namespace = "http://www.EmploymentInfo.se", propOrder = {
    "name",
    "personNumber",
    "employment"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class EmployeeType {

    @XmlElement(name = "Name", namespace = "http://www.EmploymentInfo.se", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String name;
    @XmlElement(name = "PersonNumber", namespace = "http://www.EmploymentInfo.se", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String personNumber;
    @XmlElement(name = "Employment", namespace = "http://www.EmploymentInfo.se")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<EmploymentType> employment;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the personNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPersonNumber(String value) {
        this.personNumber = value;
    }

    /**
     * Gets the value of the employment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmploymentType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<EmploymentType> getEmployment() {
        if (employment == null) {
            employment = new ArrayList<EmploymentType>();
        }
        return this.employment;
    }

}
