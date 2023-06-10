package sk.macuska.shop.model;

import jakarta.persistence.*;

@Entity
@Table(name = "t_shirts")
public class TShirt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String brand;

    private String size;

    private String color;

    private String genderCategory;

    private String material;

    private int stockQuantity;

    private double price;

    private String image;


    public TShirt() {
    }

    public TShirt(int id, String name, String brand, String size, String color, String genderCategory, String material, int stockQuantity, double price, String image) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.genderCategory = genderCategory;
        this.material = material;
        this.stockQuantity = stockQuantity;
        this.price = price;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGenderCategory() {
        return genderCategory;
    }

    public void setGenderCategory(String genderCategory) {
        this.genderCategory = genderCategory;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
