package sk.macuska.shop.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double totalPrice;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDate;

    //MAPOVANIE - VZTAHY MEDZI ENTITAMI V DATABAZE  ONETOONE, ONETOMANY, MANYTOMANY
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = ShoppingCart.class)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private List<ShoppingCart> shoppingItems;


    public Order() {
    }

    public Order(int id, double totalPrice, Date orderDate, Customer customer, List<ShoppingCart> shoppingItems) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
        this.customer = customer;
        this.shoppingItems = shoppingItems;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<ShoppingCart> getShoppingItems() {
        return shoppingItems;
    }

    public void setShoppingItems(List<ShoppingCart> shoppingItems) {
        this.shoppingItems = shoppingItems;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
