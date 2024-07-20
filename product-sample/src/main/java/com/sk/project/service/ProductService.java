package com.sk.project.service;

import java.util.List;

import com.sk.project.dto.Product;

public interface ProductService {
	Product createProduct(Product product);

    Product updateProduct(Product product);

    List < Product > getAllProduct();

    Product getProductById(long productId);

    void deleteProduct(long id);
}
