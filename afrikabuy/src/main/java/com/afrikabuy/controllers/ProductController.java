package com.afrikabuy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.afrikabuy.entities.Product;
import com.afrikabuy.services.ProductService;


@Controller
@RequestMapping("/")
public class ProductController {
	
	@Autowired
	ProductService PS;
	
	@GetMapping("/p")
	@ResponseBody
	public List<Product> getallproducts(){		
		return PS.getAll();
	}
	
	
	
	
	@GetMapping("/test")
	@ResponseBody
	public String hello() {
		return "test";
	}
	@GetMapping("/error")
	@ResponseBody
	public String error() {	
		return "error";
	}
	
	
	
	
}
