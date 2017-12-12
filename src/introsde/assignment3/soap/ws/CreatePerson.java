
package introsde.assignment3.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per createPerson complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="createPerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personIn" type="{http://ws.soap.assignment3.introsde/}person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPerson", propOrder = {
    "personIn"
})
public class CreatePerson {

    protected Person personIn;

    /**
     * Recupera il valore della proprietà personIn.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPersonIn() {
        return personIn;
    }

    /**
     * Imposta il valore della proprietà personIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPersonIn(Person value) {
        this.personIn = value;
    }

}
