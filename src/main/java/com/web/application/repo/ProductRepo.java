package com.web.application.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.application.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
