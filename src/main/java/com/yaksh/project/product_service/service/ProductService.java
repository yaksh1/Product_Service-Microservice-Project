package com.yaksh.project.product_service.service;

import com.yaksh.project.product_service.DTO.ProductRequest;
import com.yaksh.project.product_service.DTO.ProductResponse;
import com.yaksh.project.product_service.model.Product;
import com.yaksh.project.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;
    public ProductResponse createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("product {} is saved",product.getId());
        return new ProductResponse(true,"Product successfully created");

    }

    public ProductResponse getAllProducts() {
        List<Product> products = productRepository.findAll();
        ProductResponse response = new ProductResponse(true,products);
        return response;
    }
}
