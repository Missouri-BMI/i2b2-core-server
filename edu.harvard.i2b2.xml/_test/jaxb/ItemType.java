/*******************************************************************************
 * Copyright (c) 2006-2018 Massachusetts General Hospital 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. I2b2 is also distributed under
 * the terms of the Healthcare Disclaimer.
 ******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.10.27 at 11:21:39 AM EDT 
//


package jaxb;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for itemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hlevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="item_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="item_table" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="item_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="item_icon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tooltip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="constrain_by_value" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value_operator" type="{http://i2b2.mgh.harvard.edu/querytool}operatorType"/>
 *                   &lt;element name="value_constraint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="value_unit_of_measure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="value_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="constrain_by_date" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="date_from" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="date_to" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="constrain_by_modifier" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="modifier_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="modifier_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "itemType", propOrder = {
    "hlevel",
    "itemName",
    "itemTable",
    "itemKey",
    "itemIcon",
    "tooltip",
    "clazz",
    "constrainByValue",
    "constrainByDate",
    "constrainByModifier"
})
public class ItemType {

    protected int hlevel;
    @XmlElement(name = "item_name", required = true)
    protected String itemName;
    @XmlElement(name = "item_table", required = true)
    protected String itemTable;
    @XmlElement(name = "item_key", required = true)
    protected String itemKey;
    @XmlElement(name = "item_icon", required = true)
    protected String itemIcon;
    @XmlElement(required = true)
    protected String tooltip;
    @XmlElement(name = "class", required = true)
    protected String clazz;
    @XmlElement(name = "constrain_by_value")
    protected List<ItemType.ConstrainByValue> constrainByValue;
    @XmlElement(name = "constrain_by_date")
    protected ItemType.ConstrainByDate constrainByDate;
    @XmlElement(name = "constrain_by_modifier")
    protected List<ItemType.ConstrainByModifier> constrainByModifier;

    /**
     * Gets the value of the hlevel property.
     * 
     */
    public int getHlevel() {
        return hlevel;
    }

    /**
     * Sets the value of the hlevel property.
     * 
     */
    public void setHlevel(int value) {
        this.hlevel = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the itemTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTable() {
        return itemTable;
    }

    /**
     * Sets the value of the itemTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTable(String value) {
        this.itemTable = value;
    }

    /**
     * Gets the value of the itemKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemKey() {
        return itemKey;
    }

    /**
     * Sets the value of the itemKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemKey(String value) {
        this.itemKey = value;
    }

    /**
     * Gets the value of the itemIcon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemIcon() {
        return itemIcon;
    }

    /**
     * Sets the value of the itemIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemIcon(String value) {
        this.itemIcon = value;
    }

    /**
     * Gets the value of the tooltip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTooltip() {
        return tooltip;
    }

    /**
     * Sets the value of the tooltip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTooltip(String value) {
        this.tooltip = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the constrainByValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constrainByValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstrainByValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemType.ConstrainByValue }
     * 
     * 
     */
    public List<ItemType.ConstrainByValue> getConstrainByValue() {
        if (constrainByValue == null) {
            constrainByValue = new ArrayList<ItemType.ConstrainByValue>();
        }
        return this.constrainByValue;
    }

    /**
     * Gets the value of the constrainByDate property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType.ConstrainByDate }
     *     
     */
    public ItemType.ConstrainByDate getConstrainByDate() {
        return constrainByDate;
    }

    /**
     * Sets the value of the constrainByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType.ConstrainByDate }
     *     
     */
    public void setConstrainByDate(ItemType.ConstrainByDate value) {
        this.constrainByDate = value;
    }

    /**
     * Gets the value of the constrainByModifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constrainByModifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstrainByModifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemType.ConstrainByModifier }
     * 
     * 
     */
    public List<ItemType.ConstrainByModifier> getConstrainByModifier() {
        if (constrainByModifier == null) {
            constrainByModifier = new ArrayList<ItemType.ConstrainByModifier>();
        }
        return this.constrainByModifier;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="date_from" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="date_to" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dateFrom",
        "dateTo"
    })
    public static class ConstrainByDate {

        @XmlElement(name = "date_from", required = true)
        protected XMLGregorianCalendar dateFrom;
        @XmlElement(name = "date_to", required = true)
        protected XMLGregorianCalendar dateTo;

        /**
         * Gets the value of the dateFrom property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateFrom() {
            return dateFrom;
        }

        /**
         * Sets the value of the dateFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateFrom(XMLGregorianCalendar value) {
            this.dateFrom = value;
        }

        /**
         * Gets the value of the dateTo property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateTo() {
            return dateTo;
        }

        /**
         * Sets the value of the dateTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateTo(XMLGregorianCalendar value) {
            this.dateTo = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="modifier_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="modifier_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "modifierName",
        "modifierKey"
    })
    public static class ConstrainByModifier {

        @XmlElement(name = "modifier_name", required = true)
        protected String modifierName;
        @XmlElement(name = "modifier_key", required = true)
        protected String modifierKey;

        /**
         * Gets the value of the modifierName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifierName() {
            return modifierName;
        }

        /**
         * Sets the value of the modifierName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModifierName(String value) {
            this.modifierName = value;
        }

        /**
         * Gets the value of the modifierKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifierKey() {
            return modifierKey;
        }

        /**
         * Sets the value of the modifierKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModifierKey(String value) {
            this.modifierKey = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="value_operator" type="{http://i2b2.mgh.harvard.edu/querytool}operatorType"/>
     *         &lt;element name="value_constraint" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="value_unit_of_measure" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="value_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "valueOperator",
        "valueConstraint",
        "valueUnitOfMeasure",
        "valueType"
    })
    public static class ConstrainByValue {

        @XmlElement(name = "value_operator", required = true)
        protected String valueOperator;
        @XmlElement(name = "value_constraint", required = true)
        protected String valueConstraint;
        @XmlElement(name = "value_unit_of_measure", required = true)
        protected String valueUnitOfMeasure;
        @XmlElement(name = "value_type", required = true)
        protected String valueType;

        /**
         * Gets the value of the valueOperator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValueOperator() {
            return valueOperator;
        }

        /**
         * Sets the value of the valueOperator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValueOperator(String value) {
            this.valueOperator = value;
        }

        /**
         * Gets the value of the valueConstraint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValueConstraint() {
            return valueConstraint;
        }

        /**
         * Sets the value of the valueConstraint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValueConstraint(String value) {
            this.valueConstraint = value;
        }

        /**
         * Gets the value of the valueUnitOfMeasure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValueUnitOfMeasure() {
            return valueUnitOfMeasure;
        }

        /**
         * Sets the value of the valueUnitOfMeasure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValueUnitOfMeasure(String value) {
            this.valueUnitOfMeasure = value;
        }

        /**
         * Gets the value of the valueType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValueType() {
            return valueType;
        }

        /**
         * Sets the value of the valueType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValueType(String value) {
            this.valueType = value;
        }

    }

}
