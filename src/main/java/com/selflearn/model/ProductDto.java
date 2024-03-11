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
	
	

}
