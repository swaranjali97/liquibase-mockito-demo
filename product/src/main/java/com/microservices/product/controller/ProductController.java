package com.microservices.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.product.dto.ProductRequest;
import com.microservices.product.pojo.Product;
import com.microservices.product.service.ProductServiceImpl;

@RestController
public class ProductController {

	@Autowired
	private ProductServiceImpl srv;
	
//	create a product
	@PostMapping("products/createproduct")
	public Product createProduct(@RequestBody  ProductRequest productRequest) {
		return  srv.createProduct(productRequest);
	}
	
//	get all products
	
	@GetMapping("products/allproducts")
	public List<Product> getAllProducts(){
		return srv.getAllProducts();
	}
}
