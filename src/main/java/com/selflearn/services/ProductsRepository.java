package com.selflearn.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selflearn.model.Product;

public interface ProductsRepository  extends JpaRepository<Product, Integer>{

}
