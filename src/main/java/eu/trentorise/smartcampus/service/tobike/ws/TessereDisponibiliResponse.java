
package eu.trentorise.smartcampus.service.tobike.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="TessereDisponibiliResult" type="{c://inetub/wwwroot/webservice/Service.asmx}ArrayOfString" minOccurs="0"/>
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
    "tessereDisponibiliResult"
})
@XmlRootElement(name = "TessereDisponibiliResponse")
public class TessereDisponibiliResponse {

    @XmlElement(name = "TessereDisponibiliResult")
    protected ArrayOfString tessereDisponibiliResult;

    /**
     * Gets the value of the tessereDisponibiliResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getTessereDisponibiliResult() {
        return tessereDisponibiliResult;
    }

    /**
     * Sets the value of the tessereDisponibiliResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setTessereDisponibiliResult(ArrayOfString value) {
        this.tessereDisponibiliResult = value;
    }

}
