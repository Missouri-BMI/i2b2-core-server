//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.17 at 02:58:01 PM EDT 
//


package edu.harvard.i2b2.workplace.datavo.crc.setfinder.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryConstraintsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryConstraintsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="query_constraint" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}queryConstraintType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryConstraintsType", namespace = "http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/", propOrder = {
    "queryConstraint"
})
public class QueryConstraintsType {

    @XmlElement(name = "query_constraint", required = true)
    protected List<QueryConstraintType> queryConstraint;

    /**
     * Gets the value of the queryConstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryConstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryConstraintType }
     * 
     * 
     */
    public List<QueryConstraintType> getQueryConstraint() {
        if (queryConstraint == null) {
            queryConstraint = new ArrayList<QueryConstraintType>();
        }
        return this.queryConstraint;
    }

}
