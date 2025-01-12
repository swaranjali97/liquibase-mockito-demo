package com.microservices.product.dto;

public class ProductResponseDto {
	private Integer id;
	private String name;
	private String description;
	private double price;
	public ProductResponseDto(Integer id, String name, String description, double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductResponseDto [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ "]";
	}
	
	
	
}
