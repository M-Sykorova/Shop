package sk.macuska.shop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int tshirtId;

    private String tshirtName;

    private String brand;

    private int quantity;

    private double price;


    public ShoppingCart() {
    }

    public ShoppingCart(int id, int tshirtId, String tshirtName, String brand, int quantity, double price) {
        this.id = id;
        this.tshirtId = tshirtId;
        this.tshirtName = tshirtName;
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTshirtId() {
        return tshirtId;
    }

    public void setTshirtId(int tshirtId) {
        this.tshirtId = tshirtId;
    }

    public String getTshirtName() {
        return tshirtName;
    }

    public void setTshirtName(String tshirtName) {
        this.tshirtName = tshirtName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
