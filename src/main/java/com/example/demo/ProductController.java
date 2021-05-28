package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@Autowired
	ProductRepository repo;

	@RequestMapping("/AddProduct")
	public String addProduct() {
		
		return "AddProduct";
	}
	
	@PostMapping("/CreateProduct")
	public String createProduct(Products product) {
		repo.save(product);
		return "ViewProduct";
	}
	
	@RequestMapping("/ViewProduct")
	public String details() {
		return "ViewProduct";
	}
		
//	@PostMapping("/GetProduct")
//	@ResponseBody
//	public ModelAndView viewdetails(@RequestParam int productId) {
//		System.out.println("prod");
//		System.out.println(productId);
//
//		ModelAndView mv = new ModelAndView("ShowProduct");
//		List<Products> products = repo.findAll();
//		mv.addObject(products);
//		System.out.println(products);
//
//		return mv;
//	}
//	
	@PostMapping("/GetProduct")
	@ResponseBody
	public Products viewdetails(@RequestParam int productId) {
		System.out.println("prod");
		System.out.println(productId);

		//ModelAndView mv = new ModelAndView("ShowProduct");
		Products products = repo.findById(productId).orElse(null);
		//mv.addObject(products);
		//System.out.println(products);

		return products;
	}
	
}
