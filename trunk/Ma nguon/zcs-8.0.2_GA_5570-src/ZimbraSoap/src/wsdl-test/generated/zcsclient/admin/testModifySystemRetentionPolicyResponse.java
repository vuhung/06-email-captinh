
package generated.zcsclient.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import generated.zcsclient.mail.testPolicy;


/**
 * <p>Java class for modifySystemRetentionPolicyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifySystemRetentionPolicyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:zimbraMail}policy"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifySystemRetentionPolicyResponse", propOrder = {
    "policy"
})
public class testModifySystemRetentionPolicyResponse {

    @XmlElement(namespace = "urn:zimbraMail", required = true)
    protected testPolicy policy;

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link testPolicy }
     *     
     */
    public testPolicy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link testPolicy }
     *     
     */
    public void setPolicy(testPolicy value) {
        this.policy = value;
    }

}
