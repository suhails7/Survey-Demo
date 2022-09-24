package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class answer {
	@Id
	@GeneratedValue
	private int vid;
	@ManyToOne
	@JoinColumn(name = "uid")
	private User user;

	@OneToOne
	@JoinColumn(name="question")
//	@JoinColumn(name="answer")
	private question question;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public question getquestion() {
		return question;
	}
	public void setParty(question question) {
		this.question = question;
	}
	
	
	

}
