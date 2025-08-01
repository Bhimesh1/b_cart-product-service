package com.bcart.product.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
    private Integer deliveryEta; // in days
    private Integer totalViews = 0;

    public Product() {} // default constructor

    public Product(Long id, String name, String description, BigDecimal price, Integer stock, Integer deliveryEta, Integer totalViews) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.deliveryEta = deliveryEta;
        this.totalViews = totalViews;
    }

    // --- Getters ---
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getDeliveryEta() {
        return deliveryEta;
    }

    public Integer getTotalViews() {
        return totalViews;
    }

    // --- Setters ---
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setDeliveryEta(Integer deliveryEta) {
        this.deliveryEta = deliveryEta;
    }

    public void setTotalViews(Integer totalViews) {
        this.totalViews = totalViews;
    }

}
