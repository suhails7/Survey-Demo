package com.example.demo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface answerRepository extends JpaRepository<answer, Integer>{
	@Query(value = "select count(*) from answer where question=?1 and uid=?2", nativeQuery = true)

	public int countanswer(String question);

	public void save(List<question> ls);

	
}
