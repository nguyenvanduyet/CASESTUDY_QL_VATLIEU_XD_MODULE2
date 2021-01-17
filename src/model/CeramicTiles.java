package model;

import java.io.Serializable;
import java.time.LocalDate;

public class CeramicTiles extends Material implements Amount, Serializable {
    private String size;
    private double number;
    private String Color;

    public CeramicTiles(String name, String materialCode, double price, LocalDate dateOfManufacture, String manufacturer, String size, double number, String color) {
        super(name, materialCode, price, dateOfManufacture, manufacturer);
        this.size = size;
        this.number = number;
        Color = color;
    }

    public String getSize() {
        return size;
    }

    public double getNumber() {
        return number;
    }

    public String getColor() {
        return Color;
    }

    @Override
    public double getTotalMoney() {
        return number * getPrice();
    }

    @Override
    public String toString() {
        return "CeramicTiles{" + super.toString() +
                "size='" + size + '\'' +
                ", amount=" + number +
                ", Color='" + Color + '\'' + ",Total Money=" + getTotalMoney() +
                '}';
    }
}
