package com.devsuperior.myfirstprojectspringboot.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.myfirstprojectspringboot.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
