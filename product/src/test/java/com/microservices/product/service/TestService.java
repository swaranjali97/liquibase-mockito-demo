package com.microservices.product.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.microservices.product.dao.ProductDao;
import com.microservices.product.dto.ProductRequest;
import com.microservices.product.pojo.Product;

public class TestService {

	@Mock
	ProductDao testDao;
	
	@InjectMocks
	ProductServiceImpl srv;
	
	@BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
	
	@Test
	public void getAllProducts() {
		List<Product> expectedProducts = Arrays.asList(
                new Product(1, "Pen","Green color pen", 100),
                new Product(2, "Chair","Comfortable chair",500)
        );
        when(testDao.findAll()).thenReturn(expectedProducts);

        
        List<Product> actualProducts = srv.getAllProducts();

        
        assertEquals(expectedProducts, actualProducts);
	}
	
	@Test
	public void createProduct() {
		ProductRequest productRequest = new ProductRequest( "Pen", "Green color pen", 100);
		Product productToSave=new Product(null,"Pen", "Green color pen", 100);
        Product createdProduct = new Product(1, "Pen", "Green color pen", 100);
        when(testDao.save(productToSave)).thenReturn(createdProduct);

        
        Product result = srv.createProduct(productRequest);

        
        assertEquals(createdProduct, result);
	}
}
