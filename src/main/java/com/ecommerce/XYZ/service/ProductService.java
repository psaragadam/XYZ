package com.ecommerce.XYZ.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import com.ecommerce.XYZ.domain.Product;
import com.ecommerce.XYZ.repo.ProductRepository;

@Service
public class ProductService {
	
	private final ProductRepository productRepository;
	
	private final EntityManagerFactory emf;
	
	@PostConstruct
	public void setup() {
		
	}
	
	public ProductService(ProductRepository productRepository, EntityManagerFactory emf) {
		this.productRepository=productRepository;
		this.emf=emf;
	}

	public Optional<Product> getProduct(String sku) {
		return productRepository.findBySku(sku);
	}
	
	public void createProduct(Product product) {
		productRepository.save(product);
	}
	
	@SuppressWarnings("unchecked")
	public List<Product> getProductBySearchCritirea(){
		EntityManager em = emf.createEntityManager();
		StringBuilder customQuery=new StringBuilder("Select * from Product ");
		
        Query query = em.createQuery(customQuery.toString());
        List<Product> prodcuts =(List<Product>)query.getResultList();
        
        em.close();
		return prodcuts;
	}
	

}
