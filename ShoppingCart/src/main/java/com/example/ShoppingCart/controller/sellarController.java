package com.example.ShoppingCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ShoppingCart.dto.ProductDetails;
import com.example.ShoppingCart.model.fieldofcategory;
import com.example.ShoppingCart.service.service;

@RestController
public class sellarController {
	
	@Autowired
	service Customerservice;
	
	@PostMapping("/product/save")
	public String  saveProduct(@RequestBody ProductDetails productdetails) {
		
		try {
			Customerservice.saveProductDetails(productdetails);
			
		}catch(Exception e) {
			
			return "Failed";
			
		}
		
		return "Success";
	

	}
	@GetMapping("/product/getall")
	public List<fieldofcategory >getAllProducts() {
		
		List<fieldofcategory> sdk = null;
		
		try {
			
			sdk = Customerservice.getAllProducts();
			
		}catch(Exception e) {
			
			return sdk;
		}
	
	return sdk;	
		
	}
	
	@DeleteMapping("product/delete")
	public boolean getDeleteDetails() {
		
		return true;
	
	}
	
	@PutMapping("product/update")
	public fieldofcategory getUpdateDetails() {
		
		fieldofcategory sdk = null;

		
        try {
			
			sdk = Customerservice.getUpdateDetails();
			
		}catch(Exception e) {
			
			return sdk;
		}
	
        return sdk;
	
	}
		
		

}

	
