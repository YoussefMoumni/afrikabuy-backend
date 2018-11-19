package com.afrikabuy.services;



import java.util.List;
import org.springframework.stereotype.Service;
import com.afrikabuy.entities.Product;


@Service
public interface ProductService {
	
	public Product getById(int Id);
	public List<Product> getAll();	
	public void Add(Product P);
	public void delete(Product P);

}
