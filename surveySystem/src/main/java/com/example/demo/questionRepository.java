package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface questionRepository  extends JpaRepository<question, String>{

	void deleteById(int id);



}
