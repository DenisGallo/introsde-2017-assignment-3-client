
package introsde.assignment3.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per evaluatePersonPreferences complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="evaluatePersonPreferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="activity" type="{http://ws.soap.assignment3.introsde/}activity" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evaluatePersonPreferences", propOrder = {
    "personId",
    "activity",
    "value"
})
public class EvaluatePersonPreferences {

    protected long personId;
    protected Activity activity;
    protected int value;

    /**
     * Recupera il valore della propriet� personId.
     * 
     */
    public long getPersonId() {
        return personId;
    }

    /**
     * Imposta il valore della propriet� personId.
     * 
     */
    public void setPersonId(long value) {
        this.personId = value;
    }

    /**
     * Recupera il valore della propriet� activity.
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
     * Imposta il valore della propriet� activity.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setActivity(Activity value) {
        this.activity = value;
    }

    /**
     * Recupera il valore della propriet� value.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Imposta il valore della propriet� value.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

}
