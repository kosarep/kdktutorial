package pl.kosa.cars.domain;

import java.util.Date;

/**
 * Created by JF194405 on 18.07.2017.
 */
public class Car {
    private String make;
    private Date productionDate;
    private Float weight;
    private String owner;

    public String getInfo() {
        return "Marka: " + make + ", data produkcji: " + productionDate.toString() + ", waga: " + weight + ", właściciel: " + owner;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
