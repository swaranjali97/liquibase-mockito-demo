package com.microservices.product.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.microservices.product.dto.ProductRequest;
import com.microservices.product.pojo.Product;
import com.microservices.product.service.ProductServiceImpl;

@SpringJUnitConfig
public class TestController {

	@Mock
	ProductServiceImpl testSrv;
	
	@InjectMocks
	ProductController testController;
	
	@BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

	@Test
    public void testCreateProduct() {
        
        ProductRequest productRequest = new ProductRequest("Pen", "Green color pen", 100);
        Product createdProduct = new Product(1, "Pen", "Green color pen", 100);
        
        when(testSrv.createProduct(any(ProductRequest.class))).thenReturn(createdProduct);

        
        Product result = testController.createProduct(productRequest);

        
        assertEquals(createdProduct, result);
    }
	
	 @Test
	    public void testGetAllProducts() {
	       
	        List<Product> allProducts = Arrays.asList(
	                new Product(1, "Pen", "Green color pen", 100),
	                new Product(2, "Chair", "Comfortable chair", 500)
	        );
	        
	        when(testSrv.getAllProducts()).thenReturn(allProducts);

	        
	        List<Product> result = testController.getAllProducts();

	       
	        assertEquals(allProducts, result);
	    }
}
