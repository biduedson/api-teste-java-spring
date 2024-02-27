package com.example.springboot.service;


import com.example.springboot.models.ProductModel;
import com.example.springboot.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public  ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<ProductModel> getAllProducts(){
        return productRepository.findAll();
    }


    public Optional<ProductModel> getProductById(UUID id){
        return productRepository.findById(id);

    }
}
