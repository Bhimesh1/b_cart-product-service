package com.bcart.product.dto;

import com.bcart.product.model.Product;

import java.math.BigDecimal;

public class ProductDTO {
    public Long id;
    public String name;
    public String description;
    public BigDecimal price;
    public Integer stock;
    public Integer deliveryEta;
    public Integer totalViews;

    // --- Constructors ---
    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String description, BigDecimal price, Integer stock, Integer deliveryEta, Integer totalViews) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.deliveryEta = deliveryEta;
        this.totalViews = totalViews;
    }

    // --- Static Mappers ---
    public static ProductDTO fromEntity(Product p) {
        ProductDTO dto = new ProductDTO();
        dto.id = p.getId();
        dto.name = p.getName();
        dto.description = p.getDescription();
        dto.price = p.getPrice();
        dto.stock = p.getStock();
        dto.deliveryEta = p.getDeliveryEta();
        dto.totalViews = p.getTotalViews();
        return dto;
    }

    public Product toEntity() {
        Product p = new Product();
        p.setId(id);
        p.setName(name);
        p.setDescription(description);
        p.setPrice(price);
        p.setStock(stock);
        p.setDeliveryEta(deliveryEta);
        p.setTotalViews(totalViews != null ? totalViews : 0);
        return p;
    }
}
