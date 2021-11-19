//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.12 at 09:08:03 AM EST 
//


package edu.harvard.i2b2.crc.loader.datavo.loader.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for publish_data_request_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="publish_data_request_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="input_list" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}input_option_listType"/>
 *         &lt;element name="load_list" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}loadType"/>
 *         &lt;element name="output_list" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}output_option_listType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publish_data_request_type", propOrder = {

})
public class PublishDataRequestType {

    @XmlElement(name = "input_list", required = true)
    protected InputOptionListType inputList;
    @XmlElement(name = "load_list", required = true)
    protected LoadType loadList;
    @XmlElement(name = "output_list", required = true)
    protected OutputOptionListType outputList;

    /**
     * Gets the value of the inputList property.
     * 
     * @return
     *     possible object is
     *     {@link InputOptionListType }
     *     
     */
    public InputOptionListType getInputList() {
        return inputList;
    }

    /**
     * Sets the value of the inputList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputOptionListType }
     *     
     */
    public void setInputList(InputOptionListType value) {
        this.inputList = value;
    }

    /**
     * Gets the value of the loadList property.
     * 
     * @return
     *     possible object is
     *     {@link LoadType }
     *     
     */
    public LoadType getLoadList() {
        return loadList;
    }

    /**
     * Sets the value of the loadList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadType }
     *     
     */
    public void setLoadList(LoadType value) {
        this.loadList = value;
    }

    /**
     * Gets the value of the outputList property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionListType }
     *     
     */
    public OutputOptionListType getOutputList() {
        return outputList;
    }

    /**
     * Sets the value of the outputList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionListType }
     *     
     */
    public void setOutputList(OutputOptionListType value) {
        this.outputList = value;
    }

}
