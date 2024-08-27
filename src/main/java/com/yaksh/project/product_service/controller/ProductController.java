package com.yaksh.project.product_service.controller;

import com.yaksh.project.product_service.DTO.ProductRequest;
import com.yaksh.project.product_service.DTO.ProductResponse;
import com.yaksh.project.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest){
        return productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ProductResponse getAllProducts(){
        return productService.getAllProducts();
    }
}

