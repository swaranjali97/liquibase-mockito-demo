package com.microservices.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.product.pojo.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
