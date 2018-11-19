package com.afrikabuy.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import com.afrikabuy.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>, QueryByExampleExecutor<Product> {
	
	public Product findById(int Id);
	public List<Product> findAll();
	
	

}
