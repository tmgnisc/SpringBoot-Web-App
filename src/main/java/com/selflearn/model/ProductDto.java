package com.selflearn.model;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class ProductDto {
	
	
	@NotEmpty(message = "This name is required")
	private String name;
	
	@NotEmpty(message = "This brand is required")
	private String brand;
	
	@NotEmpty(message = "The category is required")
	private String category;
	
	@Min(0)
	private double price;
	
	@Size(min = 5, message = "The description should be at least 5 characters")
	@Size(max = 15, message= "The description should be exceed 15 characters")
	private String description;
	private MultipartFile imageFile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public MultipartFile getImageFile() {
		return imageFile;
	}
	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}
	
	

}
