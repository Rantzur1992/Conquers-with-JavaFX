//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.26 at 09:52:19 AM GMT 
//


package Generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="total-players" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="game-title" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DynamicPlayers")
public class DynamicPlayers {

    @XmlAttribute(name = "total-players", required = true)
    protected BigInteger totalPlayers;
    @XmlAttribute(name = "game-title", required = true)
    protected String gameTitle;

    /**
     * Gets the value of the totalPlayers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPlayers() {
        return totalPlayers;
    }

    /**
     * Sets the value of the totalPlayers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPlayers(BigInteger value) {
        this.totalPlayers = value;
    }

    /**
     * Gets the value of the gameTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGameTitle() {
        return gameTitle;
    }

    /**
     * Sets the value of the gameTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGameTitle(String value) {
        this.gameTitle = value;
    }

}
