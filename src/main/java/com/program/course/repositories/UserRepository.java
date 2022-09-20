package com.program.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.program.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {	
	
	

}
