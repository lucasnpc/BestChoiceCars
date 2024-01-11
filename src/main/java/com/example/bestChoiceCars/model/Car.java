package com.example.bestChoiceCars.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_CAR")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idCar;
    private String brand;
    private String model;
    private String year;
    private Double nOfKms;
    private Double price;
    private String fuel;

    public UUID getIdCar() {
        return idCar;
    }
    public void setIdCar(UUID idCar) {
        this.idCar = idCar;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public Double getnOfKms() {
        return nOfKms;
    }
    public void setnOfKms(Double nOfKms) {
        this.nOfKms = nOfKms;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getFuel() {
        return fuel;
    }
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

}
