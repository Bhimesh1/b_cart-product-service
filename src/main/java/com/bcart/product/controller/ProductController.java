package com.bcart.product.controller;

import com.bcart.product.dto.ProductDTO;
import com.bcart.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<ProductDTO> getAll() {
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public ProductDTO getById(@PathVariable Long id) {
        return service.getProductById(id).orElseThrow();
    }

    @PostMapping
    public ProductDTO create(@RequestBody ProductDTO dto) {
        return service.createProduct(dto);
    }

    @PutMapping("/{id}/view")
    public void trackView(@PathVariable Long id) {
        service.trackView(id);
    }
}
