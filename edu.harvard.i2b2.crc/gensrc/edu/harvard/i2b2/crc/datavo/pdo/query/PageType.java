//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.22 at 10:48:46 AM EDT 
//


package edu.harvard.i2b2.crc.datavo.pdo.query;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paging_by_patients" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}pageByPatient_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pageType", propOrder = {
    "pagingByPatients"
})
public class PageType {

    @XmlElement(name = "paging_by_patients", required = true)
    protected PageByPatientType pagingByPatients;

    /**
     * Gets the value of the pagingByPatients property.
     * 
     * @return
     *     possible object is
     *     {@link PageByPatientType }
     *     
     */
    public PageByPatientType getPagingByPatients() {
        return pagingByPatients;
    }

    /**
     * Sets the value of the pagingByPatients property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageByPatientType }
     *     
     */
    public void setPagingByPatients(PageByPatientType value) {
        this.pagingByPatients = value;
    }

}
