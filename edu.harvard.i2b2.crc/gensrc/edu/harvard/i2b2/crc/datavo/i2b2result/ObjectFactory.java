//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.12 at 09:08:03 AM EST 
//


package edu.harvard.i2b2.crc.datavo.i2b2result;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.harvard.i2b2.crc.datavo.i2b2result package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _I2B2ResultEnvelope_QNAME = new QName("http://www.i2b2.org/xsd/hive/msg/result/1.1/", "i2b2_result_envelope");
    private final static QName _Result_QNAME = new QName("http://www.i2b2.org/xsd/hive/msg/result/1.1/", "result");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.harvard.i2b2.crc.datavo.i2b2result
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link ResultEnvelopeType }
     * 
     */
    public ResultEnvelopeType createResultEnvelopeType() {
        return new ResultEnvelopeType();
    }

    /**
     * Create an instance of {@link BodyType }
     * 
     */
    public BodyType createBodyType() {
        return new BodyType();
    }

    /**
     * Create an instance of {@link DataType }
     * 
     */
    public DataType createDataType() {
        return new DataType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultEnvelopeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/hive/msg/result/1.1/", name = "i2b2_result_envelope")
    public JAXBElement<ResultEnvelopeType> createI2B2ResultEnvelope(ResultEnvelopeType value) {
        return new JAXBElement<ResultEnvelopeType>(_I2B2ResultEnvelope_QNAME, ResultEnvelopeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/hive/msg/result/1.1/", name = "result")
    public JAXBElement<ResultType> createResult(ResultType value) {
        return new JAXBElement<ResultType>(_Result_QNAME, ResultType.class, null, value);
    }

}
