package com.microservice.secondservice.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.secondservice.model.Product;
import com.microservice.secondservice.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

 @Autowired
 private ProductService productService;

 @GetMapping
 public List<Product> getAllProducts() {
     return productService.getAllProducts();
 }

 @GetMapping("/{id}")
 public ResponseEntity<Product> getProductById(@PathVariable Long id) {
     Optional<Product> product = productService.getProductById(id);
     return product.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
             .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
 }

 @PostMapping
 public ResponseEntity<Product> createProduct(@RequestBody Product product) {
     Product savedProduct = productService.saveProduct(product);
     return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
 }

 @DeleteMapping("/{id}")
 public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
     productService.deleteProduct(id);
     return new ResponseEntity<>(HttpStatus.NO_CONTENT);
 }
}

