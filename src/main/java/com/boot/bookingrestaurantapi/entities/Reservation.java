package com.boot.bookingrestaurantapi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RESTAURANT")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    @Column(name = "LOCATOR")
    private String locator;

    @Column(name = "PERSON")
    private Long person;

    @Column(name = "TURN")
    private Long turn;

    @Column(name = "DATE")
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESTAURANT_ID", nullable = false)
    private Restaurant restaurant;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLocator(String locator) {
        this.locator = locator;
    }

    public void setPerson(Long person) {
        this.person = person;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public String getLocator() {
        return locator;
    }

    public Long getPerson() {
        return person;
    }

    public Date getDate() {
        return date;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Long getTurn() {
        return turn;
    }

    public void setTurn(Long turn) {
        this.turn = turn;
    }
    
}
