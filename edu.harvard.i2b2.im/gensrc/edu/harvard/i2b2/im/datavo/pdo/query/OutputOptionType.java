//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.17 at 02:57:48 PM EDT 
//


package edu.harvard.i2b2.im.datavo.pdo.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for output_optionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="output_optionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="onlykeys" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="blob" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="techdata" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="select" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}outputOptionSelectType" default="using_filter_list" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "output_optionType")
@XmlSeeAlso({
    DimensionOutputOptionType.class,
    FactOutputOptionType.class
})
public class OutputOptionType {

    @XmlAttribute(name = "onlykeys")
    protected Boolean onlykeys;
    @XmlAttribute(name = "blob")
    protected Boolean blob;
    @XmlAttribute(name = "techdata")
    protected Boolean techdata;
    @XmlAttribute(name = "select")
    protected OutputOptionSelectType select;

    /**
     * Gets the value of the onlykeys property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOnlykeys() {
        if (onlykeys == null) {
            return true;
        } else {
            return onlykeys;
        }
    }

    /**
     * Sets the value of the onlykeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlykeys(Boolean value) {
        this.onlykeys = value;
    }

    /**
     * Gets the value of the blob property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBlob() {
        if (blob == null) {
            return false;
        } else {
            return blob;
        }
    }

    /**
     * Sets the value of the blob property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlob(Boolean value) {
        this.blob = value;
    }

    /**
     * Gets the value of the techdata property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTechdata() {
        if (techdata == null) {
            return false;
        } else {
            return techdata;
        }
    }

    /**
     * Sets the value of the techdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTechdata(Boolean value) {
        this.techdata = value;
    }

    /**
     * Gets the value of the select property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionSelectType }
     *     
     */
    public OutputOptionSelectType getSelect() {
        if (select == null) {
            return OutputOptionSelectType.USING_FILTER_LIST;
        } else {
            return select;
        }
    }

    /**
     * Sets the value of the select property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionSelectType }
     *     
     */
    public void setSelect(OutputOptionSelectType value) {
        this.select = value;
    }

}
