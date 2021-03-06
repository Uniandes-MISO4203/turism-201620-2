/*
The MIT License (MIT)
Copyright (c) 2015 Los Andes University
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package co.edu.uniandes.csw.turism.entities;

import java.io.Serializable;
import javax.persistence.*;

import co.edu.uniandes.csw.crud.spi.entity.BaseEntity;

import java.util.Date;

import uk.co.jemos.podam.common.PodamExclude;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @generated
 */
@Entity
public class TripEntity extends BaseEntity implements Serializable {

    private String image;

    private Long price;

    @Temporal(TemporalType.DATE)
    private Date departureDate;

    private String destination;

    private int quota;

    private int duration;

    private String transport;

    private boolean promotion;

    private Long discountRate;

    private String conditions;

    @PodamExclude
    @ManyToOne
    private AgencyEntity agency;

    @PodamExclude
    @OneToMany
    private List<CategoryEntity> category = new ArrayList<>();

    @PodamExclude
    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<QuestionEntity> questions = new ArrayList<>();

    @PodamExclude
    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CommentaryEntity> comments = new ArrayList<>();

    @PodamExclude
    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DestinationEntity> destinations = new ArrayList<>();

    /**
     * Obtiene el atributo image.
     *
     * @return atributo image.
     * @generated
     */
    public String getImage() {
        return image;
    }

    /**
     * Establece el valor del atributo image.
     *
     * @param image nuevo valor del atributo
     * @generated
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Obtiene el atributo price.
     *
     * @return atributo price.
     * @generated
     */
    public Long getPrice() {
        return price;
    }

    /**
     * Establece el valor del atributo price.
     *
     * @param price nuevo valor del atributo
     * @generated
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * Obtiene el atributo departureDate.
     *
     * @return atributo departureDate.
     * @generated
     */
    public Date getDepartureDate() {
        return departureDate;
    }

    /**
     * Establece el valor del atributo departureDate.
     *
     * @param departureDate nuevo valor del atributo
     * @generated
     */
    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    /**
     * Obtiene el atributo destination.
     *
     * @return atributo destination.
     * @generated
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Establece el valor del atributo destination.
     *
     * @param destination nuevo valor del atributo
     * @generated
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Obtiene el atributo quota.
     *
     * @return atributo quota.
     * @generated
     */
    public int getQuota() {
        return quota;
    }

    /**
     * Establece el valor del atributo quota.
     *
     * @param quota nuevo valor del atributo
     * @generated
     */
    public void setQuota(int quota) {
        this.quota = quota;
    }

    /**
     * Obtiene el atributo duration.
     *
     * @return atributo duration.
     * @generated
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Establece el valor del atributo duration.
     *
     * @param duration nuevo valor del atributo
     * @generated
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Obtiene el atributo transport.
     *
     * @return atributo transport.
     * @generated
     */
    public String getTransport() {
        return transport;
    }

    /**
     * Establece el valor del atributo transport.
     *
     * @param transport nuevo valor del atributo
     * @generated
     */
    public void setTransport(String transport) {
        this.transport = transport;
    }

    /**
     * Obtiene el atributo agency.
     *
     * @return atributo agency.
     * @generated
     */
    public AgencyEntity getAgency() {
        return agency;
    }

    /**
     * Establece el valor del atributo agency.
     *
     * @param agency nuevo valor del atributo
     * @generated
     */
    public void setAgency(AgencyEntity agency) {
        this.agency = agency;
    }

    /**
     * Obtiene la colección de category.
     *
     * @return colección category.
     * @generated
     */
    public List<CategoryEntity> getCategory() {
        return category;
    }

    /**
     * Establece el valor de la colección de category.
     *
     * @param category nuevo valor de la colección.
     * @generated
     */
    public void setCategory(List<CategoryEntity> category) {
        this.category = category;
    }

    /**
     * <<<<<<< HEAD
     * Obtener valor boolean  promocion
     * =======
     * Obtener valor boolean promocion
     * >>>>>>> de3f7a132e24daf11fc923195e33c1343515fc9c
     *
     * @return
     */
    public boolean getPromotion() {
        return promotion;
    }

    /**
     * Asignar valor si en promosion
     *
     * @param promotion
     */
    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }

    /**
     * <<<<<<< HEAD
     * =======
     * <p>
     * >>>>>>> de3f7a132e24daf11fc923195e33c1343515fc9c
     *
     * @return discountRate
     */
    public Long getDiscountRate() {
        return discountRate;
    }

    /**
     * <<<<<<< HEAD
     * =======
     * <p>
     * >>>>>>> de3f7a132e24daf11fc923195e33c1343515fc9c
     *
     * @param discountRate
     */
    public void setDiscountRate(Long discountRate) {
        this.discountRate = discountRate;
    }

    /**
     * Obtiene la colección de questions.
     *
     * @return colección questions.
     * @generated
     */
    public List<QuestionEntity> getQuestions() {
        return questions;
    }

    /**
     * Establece el valor de la colección de questions.
     *
     * @param questions nuevo valor de la colección.
     * @generated
     */
    public void setQuestions(List<QuestionEntity> questions) {
        this.questions = questions;
    }

    /**
     * Obtiene el las condiciones de un {@link TripEntity}
     *
     * @return las condiciones de un {@link TripEntity}
     */
    public String getConditions() {
        return conditions;
    }

    /**
     * Asigna el valor de las condiciones de un {@link TripEntity}
     *
     * @param conditions las condiciones del {@link TripEntity}
     */
    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    /**
     * Obtiene la colección de commentys.
     *
     * @return colección questions.
     * @generated
     */
    public List<CommentaryEntity> getComments() {
        return comments;
    }

    /**
     * Establece el valor de la colección de questions.
     *
     * @param comments nuevo valor de la colección.
     * @generated
     */
    public void setComments(List<CommentaryEntity> comments) {
        this.comments = comments;
    }

    /**
     * Obtiene la colección de destinations.
     *
     * @return colección destinations.
     * @generated
     */
    public List<DestinationEntity> getDestinations() {
        return destinations;
    }

    /**
     * Establece el valor de la colección de destinations.
     *
     * @param destinations nuevo valor de la colección.
     * @generated
     */
    public void setDestinations(List<DestinationEntity> destinations) {
        this.destinations = destinations;
    }
}
