package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Cement extends Material implements Amount, Serializable {
    private String mark;
    private double mass;
    private LocalDate expirationDate;

    public Cement(String name, String materialCode, double price, LocalDate dateOfManufacture, String manufacturer, String mark, double mass) {
        super(name, materialCode, price, dateOfManufacture, manufacturer);
        this.mark = mark;
        this.mass = mass;
    }

    public String getMark() {
        return mark;
    }

    public double getMass() {
        return mass;
    }

    public LocalDate getExpirationDate() {
        return super.getDateOfManufacture().plusYears(1);
    }

    @Override
    public double getTotalMoney() {
        return mass * getPrice();
    }

    @Override
    public String toString() {
        return "Cement{" + super.toString() +
                "mark='" + mark + '\'' +
                ", mass=" + mass +'\'' + ",Total Money=" + getTotalMoney() +'\'' + ",Exp=" + getExpirationDate()+
                '}';
    }
}
