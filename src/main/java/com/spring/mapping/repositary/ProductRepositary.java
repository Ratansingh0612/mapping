package com.spring.mapping.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mapping.entity.Product;

public interface ProductRepositary extends JpaRepository<Product, Integer> {

}
