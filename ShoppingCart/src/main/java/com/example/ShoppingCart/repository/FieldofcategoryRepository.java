package com.example.ShoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.ShoppingCart.model.fieldofcategory;


@Repository
public interface FieldofcategoryRepository extends JpaRepository<fieldofcategory,String>  {



}
