
package generated.zcsclient.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifySMIMEConfigRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifySMIMEConfigRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="config" type="{urn:zimbraAdmin}smimeConfigModifications"/>
 *         &lt;element name="domain" type="{urn:zimbraAdmin}domainSelector" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifySMIMEConfigRequest", propOrder = {
    "config",
    "domain"
})
public class testModifySMIMEConfigRequest {

    @XmlElement(required = true)
    protected testSmimeConfigModifications config;
    protected testDomainSelector domain;

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link testSmimeConfigModifications }
     *     
     */
    public testSmimeConfigModifications getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link testSmimeConfigModifications }
     *     
     */
    public void setConfig(testSmimeConfigModifications value) {
        this.config = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link testDomainSelector }
     *     
     */
    public testDomainSelector getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link testDomainSelector }
     *     
     */
    public void setDomain(testDomainSelector value) {
        this.domain = value;
    }

}
