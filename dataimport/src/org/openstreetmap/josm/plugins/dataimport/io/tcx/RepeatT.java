//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2008.08.10 at 10:24:05 AM CEST
//


package org.openstreetmap.josm.plugins.dataimport.io.tcx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Repeat_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Repeat_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}AbstractStep_t">
 *       &lt;sequence>
 *         &lt;element name="Repetitions" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Repetitions_t"/>
 *         &lt;element name="Child" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}AbstractStep_t" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Repeat_t", propOrder = {
    "repetitions",
    "child"
})
public class RepeatT
    extends AbstractStepT
{

    @XmlElement(name = "Repetitions")
    protected int repetitions;
    @XmlElement(name = "Child", required = true)
    protected List<AbstractStepT> child;

    /**
     * Gets the value of the repetitions property.
     *
     */
    public int getRepetitions() {
        return repetitions;
    }

    /**
     * Sets the value of the repetitions property.
     *
     */
    public void setRepetitions(int value) {
        this.repetitions = value;
    }

    /**
     * Gets the value of the child property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the child property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChild().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractStepT }
     *
     *
     */
    public List<AbstractStepT> getChild() {
        if (child == null) {
            child = new ArrayList<>();
        }
        return this.child;
    }

}
