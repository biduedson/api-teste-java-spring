package com.example.springboot.utils;

import com.example.springboot.models.ProductModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class ValidateIsEmpty {
        public ResponseEntity<String> validateIsEmpty(Optional<ProductModel>  obj){
            if(obj.isEmpty()){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found validade class.");
            }else{
                return  null;
            }

        }

    }

