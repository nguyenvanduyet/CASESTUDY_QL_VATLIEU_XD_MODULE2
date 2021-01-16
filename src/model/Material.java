package model;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Material implements Serializable {
    private String name;
    private String materialCode;
    private double price;
    private LocalDate dateOfManufacture;
    private String manufacturer;
    public Material(String name, String materialCode, double price, LocalDate dateOfManufacture, String manufacturer) {
        this.name = name;
        this.materialCode = materialCode;
        this.price = price;
        this.dateOfManufacture = dateOfManufacture;
        this.manufacturer = manufacturer;
    }
    public String getName() {
        return name;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Material{" +
                "name='" + name + '\'' +
                ", materialCode='" + materialCode + '\'' +
                ", price=" + price +
                ", dateOfManufacture=" + dateOfManufacture +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
