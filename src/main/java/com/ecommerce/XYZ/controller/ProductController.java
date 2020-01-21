package com.ecommerce.XYZ.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.XYZ.domain.Product;
import com.ecommerce.XYZ.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	private final ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService=productService;
	}
	
	@GetMapping("/{sku}")
	public ResponseEntity<?> getProduct(@PathVariable String sku){
		Optional<Product> product= productService.getProduct(sku);
		if(product.isPresent()) {
			return new ResponseEntity<>(product.get(), HttpStatus.OK);
		} 
		return new ResponseEntity<>("Product not found", HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("/add")
	public ResponseEntity<?> createProduct(@RequestBody Product product) {
		try {
			productService.createProduct(product);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateProduct(@RequestBody Product product) {
		try {
			productService.createProduct(product);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
