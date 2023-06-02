package com.example.ellaboatproject.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Race")
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int raceDate;


    @Column(nullable = false)
    private int boatId;

    @Column(nullable = false)
    private int points;


    public int getRaceDate() {
        return raceDate;
    }

    public void setRaceDate(int raceDate) {
        this.raceDate = raceDate;
    }

    public int getBoatId() {
        return boatId;
    }

    public void setBoatId(int boatId) {
        this.boatId = boatId;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
