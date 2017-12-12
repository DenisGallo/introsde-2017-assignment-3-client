
package introsde.assignment3.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per savePersonPreferences complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="savePersonPreferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="activity" type="{http://ws.soap.assignment3.introsde/}activity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "savePersonPreferences", propOrder = {
    "personId",
    "activity"
})
public class SavePersonPreferences {

    protected long personId;
    protected Activity activity;

    /**
     * Recupera il valore della proprietà personId.
     * 
     */
    public long getPersonId() {
        return personId;
    }

    /**
     * Imposta il valore della proprietà personId.
     * 
     */
    public void setPersonId(long value) {
        this.personId = value;
    }

    /**
     * Recupera il valore della proprietà activity.
     * 
     * @return
     *     possible object is
     *     {@link Activity }
     *     
     */
    public Activity getActivity() {
        return activity;
    }

    /**
     * Imposta il valore della proprietà activity.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setActivity(Activity value) {
        this.activity = value;
    }

}
