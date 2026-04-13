package com.boot.bookingrestaurantapi.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "RESTAURANT")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = true)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "IMAGE")
    private String image;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "restaurant")
    private List<Reservation> reservations;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "restaurant")
    private List<Board> boards;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "")
    private List<Turn> turns;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void setBoards(List<Board> boards) {
        this.boards = boards;
    }

    public void setTurns(List<Turn> turns) {
        this.turns = turns;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public List<Board> getBoards() {
        return boards;
    }

    public List<Turn> getTurns() {
        return turns;
    }

}
