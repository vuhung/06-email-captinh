
package generated.zcsclient.mail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dismissCalendarItemAlarmResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dismissCalendarItemAlarmResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="appt" type="{urn:zimbraMail}updatedAppointmentAlarmInfo"/>
 *           &lt;element name="task" type="{urn:zimbraMail}updatedTaskAlarmInfo"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dismissCalendarItemAlarmResponse", propOrder = {
    "apptOrTask"
})
public class testDismissCalendarItemAlarmResponse {

    @XmlElements({
        @XmlElement(name = "task", type = testUpdatedTaskAlarmInfo.class),
        @XmlElement(name = "appt", type = testUpdatedAppointmentAlarmInfo.class)
    })
    protected List<testUpdatedAlarmInfo> apptOrTask;

    /**
     * Gets the value of the apptOrTask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apptOrTask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApptOrTask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link testUpdatedTaskAlarmInfo }
     * {@link testUpdatedAppointmentAlarmInfo }
     * 
     * 
     */
    public List<testUpdatedAlarmInfo> getApptOrTask() {
        if (apptOrTask == null) {
            apptOrTask = new ArrayList<testUpdatedAlarmInfo>();
        }
        return this.apptOrTask;
    }

}
