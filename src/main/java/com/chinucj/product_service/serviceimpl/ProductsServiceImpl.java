package com.chinucj.product_service.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chinucj.product_service.dto.ProductsRequestDto;
import com.chinucj.product_service.dto.ProductsResponseDto;
import com.chinucj.product_service.model.Products;
import com.chinucj.product_service.repository.ProductsRepository;
import com.chinucj.product_service.service.ProductsService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductsServiceImpl implements ProductsService {

	
	private final ProductsRepository productsRepo;
	
	@Override
	public void createProduct(ProductsRequestDto dto) {
		Products product = Products.builder().name(dto.getName()).description(dto.getDescription())
							.price(dto.getPrice()).build();
		productsRepo.save(product);
		log.info("Product {} is saved" , product.getName());
	}

	@Override
	public List<ProductsResponseDto> getAllProducts() {
		log.info("Inside getAllProducts method");
		List<Products> products = productsRepo.findAll();
		return products.stream().map(this::mapToProductResponse).toList();
	}

	private ProductsResponseDto mapToProductResponse(Products product) {
		return ProductsResponseDto.builder().id(product.getId())
				.name(product.getName())
				.description(product.getDescription())
				.price(product.getPrice())
				.build();
	}

}
