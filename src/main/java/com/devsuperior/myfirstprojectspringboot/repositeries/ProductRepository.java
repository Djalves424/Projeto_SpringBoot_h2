package com.devsuperior.myfirstprojectspringboot.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.myfirstprojectspringboot.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
