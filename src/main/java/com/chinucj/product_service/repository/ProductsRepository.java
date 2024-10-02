package com.chinucj.product_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chinucj.product_service.model.Products;

public interface ProductsRepository extends MongoRepository<Products, String> {

}
