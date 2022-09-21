package com.program.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.program.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
