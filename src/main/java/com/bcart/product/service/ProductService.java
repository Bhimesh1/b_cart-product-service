package com.bcart.product.service;

import com.bcart.product.dto.ProductDTO;
import com.bcart.product.model.Product;
import com.bcart.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<ProductDTO> getAllProducts() {
        return repository.findAll().stream().map(ProductDTO::fromEntity).collect(Collectors.toList());
    }

    public Optional<ProductDTO> getProductById(Long id) {
        return repository.findById(id).map(ProductDTO::fromEntity);
    }

    public ProductDTO createProduct(ProductDTO dto) {
        Product product = dto.toEntity();
        return ProductDTO.fromEntity(repository.save(product));
    }

    public void trackView(Long productId) {
        repository.findById(productId).ifPresent(product -> {
            product.setTotalViews(product.getTotalViews() + 1);
            repository.save(product);
        });
    }
}
