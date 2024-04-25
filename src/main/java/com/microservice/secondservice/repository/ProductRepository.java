package com.microservice.secondservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.secondservice.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
