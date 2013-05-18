
package generated.zcsclient.mail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sizeTest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sizeTest">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:zimbraMail}filterTest">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="numberComparison" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sizeTest")
public class testSizeTest
    extends testFilterTest
{

    @XmlAttribute(name = "numberComparison")
    protected String numberComparison;
    @XmlAttribute(name = "s")
    protected String s;

    /**
     * Gets the value of the numberComparison property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberComparison() {
        return numberComparison;
    }

    /**
     * Sets the value of the numberComparison property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberComparison(String value) {
        this.numberComparison = value;
    }

    /**
     * Gets the value of the s property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getS() {
        return s;
    }

    /**
     * Sets the value of the s property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS(String value) {
        this.s = value;
    }

}
