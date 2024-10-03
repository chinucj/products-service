package com.chinucj.product_service.service;

import java.util.List;

import com.chinucj.product_service.dto.ProductsRequestDto;
import com.chinucj.product_service.dto.ProductsResponseDto;

public interface ProductsService {
void createProduct(ProductsRequestDto dto);
List<ProductsResponseDto> getAllProducts();
}
