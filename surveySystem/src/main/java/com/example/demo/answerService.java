package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class answerService {
	@Autowired
	answerRepository repo;
	public void save(answer answer) {
		repo.save(answer);
	}
	public List<answer> listall(){
		
		return repo.findAll();
		
	}
	public int count(String question) {
//	System.out.println(question+" " +uid);
		
		return repo.countanswer(question);
	}
	

}
