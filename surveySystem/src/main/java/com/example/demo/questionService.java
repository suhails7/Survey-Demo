package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class questionService {
	
	@Autowired
	questionRepository repo;
	public void savequestion(question question) {
		repo.save(question);
	}
	public List<question> listall(){
		return repo.findAll();
	}
	public void deletequestion(int id) {
		repo.deleteById(id);
	}

}
