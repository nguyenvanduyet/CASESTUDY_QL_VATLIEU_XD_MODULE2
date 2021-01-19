package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Steel extends Material implements Amount, Serializable {
    private String diameter;
    public double length;
    private double weight;

    public Steel(String name, String materialCode, double price, LocalDate dateOfManufacture, String manufacturer, String diameter, double length, double weight) {
        super(name, materialCode, price, dateOfManufacture, manufacturer);
        this.diameter = diameter;
        this.length = length;
        this.weight = weight;
    }

    public String getDiameter() {
        return diameter;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double getTotalMoney() {
        return weight * getPrice();
    }

    @Override
    public String toString() {
        return "Steel{" + super.toString() +
                "africa='" + diameter + '\'' +
                ", length='" + length + '\'' +
                ", weight=" + weight + '\'' +",Total Money=" + getTotalMoney() +
                '}'+"\n";
    }
}
