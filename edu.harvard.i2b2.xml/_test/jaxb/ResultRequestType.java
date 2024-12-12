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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for result_requestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="result_requestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://i2b2.mgh.harvard.edu/querytool}requestType">
 *       &lt;sequence>
 *         &lt;element name="query_result_instance_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "result_requestType", propOrder = {
    "queryResultInstanceId"
})
public class ResultRequestType
    extends RequestType
{

    @XmlElement(name = "query_result_instance_id")
    protected int queryResultInstanceId;

    /**
     * Gets the value of the queryResultInstanceId property.
     * 
     */
    public int getQueryResultInstanceId() {
        return queryResultInstanceId;
    }

    /**
     * Sets the value of the queryResultInstanceId property.
     * 
     */
    public void setQueryResultInstanceId(int value) {
        this.queryResultInstanceId = value;
    }

}
