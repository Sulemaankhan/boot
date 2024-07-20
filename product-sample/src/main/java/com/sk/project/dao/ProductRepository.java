package com.sk.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.project.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
