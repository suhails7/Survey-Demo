package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class question {
	@Id
	@GeneratedValue
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String question;
	private boolean answer;

	public boolean isAnswer() {
		return answer;
	}

	public void setAnswer(boolean answer) {
		this.answer = answer;
	}

//	@Override
//	public String toString() {
//		return "question [question=" + question + "]";
//	}

	public String getQuestion() {
		return question;
	}

	@Override
	public String toString() {
		return "question [id=" + id + ", question="+ question + ", answer=" + answer + "]";
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	
	
	
}
