package com.program.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.program.course.entities.categories.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>     {

}
