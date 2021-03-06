/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.turism.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import co.edu.uniandes.csw.crud.spi.entity.BaseEntity;
import javax.persistence.ManyToOne;
import uk.co.jemos.podam.common.PodamExclude;

/**
 *
 * @author fe.ruiz
 */
/**
 * @generated
 */
@Entity
public class CommentaryEntity extends BaseEntity implements Serializable{

    private String description  ;
    private Long  score;  
    
    
    @PodamExclude
    @ManyToOne
    private TripEntity trip;
     
      /**
     * Obtiene el atributo description.
     *
     * @return atributo pdescription.
     * @generated
     */
    public String getDescription() {
        return description;
    }
    
      /**
     * establece el atributo  description.
     * @generated
     */

    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
    * Establece el atributo  score  
    * @return score
    */
    public Long getScore() {
        return score;
    }

    /**
     * Asigna el atributo  score 
     * @param score 
     */
    public void setScore(Long score) {
        this.score = score;
    }
    
    
    /**
     * Obtiene el atributo trip.
     *
     * @return atributo trip.
     * @generated
     */
    public TripEntity getTrip() {
        return trip;
    }

    /**
     * Establece el valor del atributo trip.
     *
     * @param trip nuevo valor del atributo
     * @generated
     */
    public void setTrip(TripEntity trip) {
        this.trip = trip;
    }
}
