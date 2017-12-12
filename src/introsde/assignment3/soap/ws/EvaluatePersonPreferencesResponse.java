
package introsde.assignment3.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per evaluatePersonPreferencesResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="evaluatePersonPreferencesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="preference" type="{http://ws.soap.assignment3.introsde/}activity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evaluatePersonPreferencesResponse", propOrder = {
    "preference"
})
public class EvaluatePersonPreferencesResponse {

    protected Activity preference;

    /**
     * Recupera il valore della proprietà preference.
     * 
     * @return
     *     possible object is
     *     {@link Activity }
     *     
     */
    public Activity getPreference() {
        return preference;
    }

    /**
     * Imposta il valore della proprietà preference.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setPreference(Activity value) {
        this.preference = value;
    }

}
