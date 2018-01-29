
package JAXB.employmentrecord;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmploymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmploymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="PayPal"/>
 *               &lt;enumeration value="Gamestop"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Role">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Sr.Developer"/>
 *               &lt;enumeration value="Customer Support"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StartDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2012-01-01"/>
 *               &lt;enumeration value="2017-01-01"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EndDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2017-01-01"/>
 *               &lt;enumeration value="2018-01-01"/>
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
@XmlType(name = "EmploymentType", namespace = "http://www.EmploymentInfo.se", propOrder = {
    "companyName",
    "role",
    "startDate",
    "endDate"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class EmploymentType {

    @XmlElement(name = "CompanyName", namespace = "http://www.EmploymentInfo.se", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String companyName;
    @XmlElement(name = "Role", namespace = "http://www.EmploymentInfo.se", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String role;
    @XmlElement(name = "StartDate", namespace = "http://www.EmploymentInfo.se", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String startDate;
    @XmlElement(name = "EndDate", namespace = "http://www.EmploymentInfo.se", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String endDate;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-01-29T01:08:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEndDate(String value) {
        this.endDate = value;
    }

}
