package com.example.ShoppingCart.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ShoppingCart.dto.ProductDetails;
import com.example.ShoppingCart.model.fieldofcategory;
import com.example.ShoppingCart.service.service;


@RestController
public class customerController {
	@Autowired
	service Customerservice;
	
	@GetMapping("product/get/{id}")
	public fieldofcategory getproductdetails(@PathVariable int id) {
		fieldofcategory sdk = null;
		try {
			sdk = Customerservice.getProductDetails(id);
		}catch(Exception e) {
			return sdk;
		}
	
	return sdk;	
	}
	
	
}
