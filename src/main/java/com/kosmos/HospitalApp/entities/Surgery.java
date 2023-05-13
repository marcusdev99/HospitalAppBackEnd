package com.kosmos.HospitalApp.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Surgery {

    @Id
    private String SurgeryId;
    private int surgeryNumber;
    private int floor;

    public int getSurgeryNumber() {
        return surgeryNumber;
    }

    public void setSurgeryNumber(int surgeryNumber) {
        this.surgeryNumber = surgeryNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
