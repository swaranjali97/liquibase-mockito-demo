package com.microservices.product.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservices.product.dto.ProductRequest;
import com.microservices.product.pojo.Product;

public interface ProductService {
	public Product createProduct(  ProductRequest productRequest);
	public List<Product> getAllProducts(  );
}
