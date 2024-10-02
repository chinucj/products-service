package com.chinucj.product_service.model;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document(value = "products")
public class Products {

	private String id;
	private String name;
	private String description;
	private BigDecimal price;
}
