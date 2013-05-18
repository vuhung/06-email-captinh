
package generated.zcsclient.mail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataSourceNameOrId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataSourceNameOrId">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:zimbraMail}nameOrId">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataSourceNameOrId")
@XmlSeeAlso({
    testPop3DataSourceNameOrId.class,
    testCalDataSourceNameOrId.class,
    testUnknownDataSourceNameOrId.class,
    testRssDataSourceNameOrId.class,
    testCaldavDataSourceNameOrId.class,
    testYabDataSourceNameOrId.class,
    testImapDataSourceNameOrId.class,
    testGalDataSourceNameOrId.class
})
public abstract class testDataSourceNameOrId
    extends testNameOrId
{


}
