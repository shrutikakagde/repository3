package com.example.ShoppingCart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ShoppingCart.dto.ProductDetails;
import com.example.ShoppingCart.model.category;
import com.example.ShoppingCart.model.fieldofcategory;
import com.example.ShoppingCart.repository.FieldofcategoryRepository;
import com.example.ShoppingCart.repository.categoryrepository;

@Service
public class serviceimpl implements service{
	@Autowired
	 categoryrepository Categ;

	@Autowired
	FieldofcategoryRepository fr;
	@Override
	public void saveProductDetails(ProductDetails productdetails) {
		// TODO Auto-generated method stub
		
	category cat =  Categ.getById(productdetails.getId());
		
		category c= new category();
	    c.setId( productdetails.getId());
	    c.setProductName(productdetails.getProductName());
	    c.setProductType(productdetails.getProductType());
	    c.setPrice(productdetails.getPrice());
	    c.setDescription(productdetails.getDescription());
	    
		
		fieldofcategory fc= new fieldofcategory();
		fc.setProductId( productdetails.getProductId());
		fc.setBrandName( productdetails.getName());
		fc.setCategory( productdetails.getCategory());
		fc.setSize(productdetails.getSize());
		fc.setType(productdetails.getType());
		fc.setId(productdetails.getId());
		
		fr.save(fc);
		Categ.save(c);
	}

	public fieldofcategory getProductDetails(String id) {
		
	return 	fr.getById(id);
		
	}
	
	public List<fieldofcategory >getAllProducts(){
		
		return fr.findAll();
		
	}

	@Override
	public fieldofcategory getProductDetails(ProductDetails productdetails) {
		// TODO Auto-generated method stub
		return fr.getById(null);
	}

	@Override
	public fieldofcategory getProductDetails1(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getDeleteDetails() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public fieldofcategory getUpdateDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public fieldofcategory getProductDetails(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
 
}
