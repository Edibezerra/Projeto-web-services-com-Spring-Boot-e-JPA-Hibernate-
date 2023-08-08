package com.example.webservice.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
