package com.chinucj.product_service.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.chinucj.product_service.dto.ProductsRequestDto;
import com.chinucj.product_service.dto.ProductsResponseDto;
import com.chinucj.product_service.service.ProductsService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductsController {
	
	private final ProductsService service;

	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createProduct(@RequestBody ProductsRequestDto dto) {
		service.createProduct(dto);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<ProductsResponseDto> getAllProducts(){
		return service.getAllProducts();
	}
	
}
