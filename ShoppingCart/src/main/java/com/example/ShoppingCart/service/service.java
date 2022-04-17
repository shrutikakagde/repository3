package com.example.ShoppingCart.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.ShoppingCart.dto.ProductDetails;
import com.example.ShoppingCart.model.fieldofcategory;

@Service
public interface service {

	public void  saveProductDetails( ProductDetails productdetails);
	
	public fieldofcategory getProductDetails(int id);

	public fieldofcategory getProductDetails(ProductDetails productdetails);

	public fieldofcategory getProductDetails1(String id);
	
	public List<fieldofcategory >getAllProducts();
	
	public boolean getDeleteDetails();
	
	public fieldofcategory getUpdateDetails();
	

}
