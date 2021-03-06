/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.turism.dtos.minimum;

import co.edu.uniandes.csw.turism.entities.CommentaryEntity;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author fe.ruiz
 */
/**
 * @generated
 */
@XmlRootElement
public class CommentaryDTO  implements Serializable{
  private Long id ; 
  private String description; 
  private Long score ;


    /**
     * @generated
     */
    public CommentaryDTO() {
        // Método auto-generado
    }  
  
  /**
     * Crea un objeto CommentaryDTO  a partir de un objeto CommentaryEntity.
     *
     * @param entity Entidad CommentaryEntity desde la cual se va a crear el nuevo objeto.
     * @generated
     */
  public  CommentaryDTO (CommentaryEntity entity) {
      if (entity!=null){
        this.id=entity.getId();
        this.description = entity.getDescription();
        this.score =  entity.getScore();
       }
  }
  
  /**
     * Convierte un objeto CommentaryDTO a CommentaryEntity.
     *
     * @return Nueva objeto TripEntity.
     * @generated
     */
  public CommentaryEntity toEntity () {
      CommentaryEntity entity = new CommentaryEntity();
      entity.setId(this.getId());
      entity.setDescription(this.description);
      entity.setScore(this.score);
      return entity;
  }
  
  /**
     * Obtiene el atributo id.
     *
     * @return atributo id.
     * @generated
     */
   public Long getId() {
        return id;
    }

     /**
     * Establece el valor del atributo id.
     *
     * @param id nuevo valor del atributo
     * @generated
     */
    public void setId(Long id) {
        this.id = id;
    }

     /**
     * Obtiene el atributo description
     *
     * @return atributo description.
     * @generated
     */
    public String getDescription() {
        return description;
    }

     /**
     * Establece el valor del atributo description.
     *
     * @param description nuevo valor del atributo
     * @generated 
     */
    public void setDescription(String description) {
        this.description = description;
    }

     /**
     * Obtiene el atributo score
     *
     * @return atributo score.
     * @generated
     */
    public Long getScore() {
        return score;
    }

     /**
     * Establece el atributo score
     * @param score
     * @generated
     */
    public void setScore(Long score) {
        this.score = score;
    }
}