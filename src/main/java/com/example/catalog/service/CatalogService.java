package com.example.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalog.domain.Product;
import com.example.catalog.repository.ProductRepository;

@Service
public class CatalogService {
	@Autowired
	private ProductRepository repository;
	
	public List<Product> getProducts(){
		return (List<Product>) repository.findAll();
	}
	
	public Product getProductById(String id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<Product> findByCategory(String category){
		return repository.findByCategory(category); //To verify
	}
	
	public Product saveProduct(Product pr) {
		return repository.save(pr);
	}
	
	public Product updateAvailability(String productId, int change) {
		/*template.updateFirst(
				Query.query(Criteria.where("id").is(productId)),
				new Update().inc("availability", change),
				Product.class
				);
		
		return getProductById(productId);*/
		return null;
	}
}
