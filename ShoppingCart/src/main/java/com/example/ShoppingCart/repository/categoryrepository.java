package com.example.ShoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ShoppingCart.model.category;



@Repository
public interface categoryrepository extends JpaRepository<category,String> {

	category getById(int id);

}
