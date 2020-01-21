package com.ecommerce.XYZ.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.XYZ.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	Optional<Product> findBySku(String sku);
	
	List<Product> findByBrandAndType(String brand, String type);
	
}
