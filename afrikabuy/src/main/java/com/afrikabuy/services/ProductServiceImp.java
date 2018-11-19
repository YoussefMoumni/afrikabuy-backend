package com.afrikabuy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afrikabuy.entities.Product;
import com.afrikabuy.repositories.ProductRepository;


@Service("productService")
public class ProductServiceImp implements ProductService {
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product getById(int Id) {

		return productRepository.findById(Id);
	}

	@Override
	public List<Product> getAll() {
	return	productRepository.findAll();
		
	}

	@Override
	public void Add(Product P) {
		productRepository.save(P);
		
	}

	@Override
	public void delete(Product P) {
		productRepository.delete(P);
		
	}
}
