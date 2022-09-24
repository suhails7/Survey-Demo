package com.example.demo;

import java.sql.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.eclipse.jdt.internal.compiler.ast.WhileStatement;
import org.hibernate.boot.jaxb.hbm.internal.ImplicitResultSetMappingDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class mainController {
	/*
	 * 
	 * user controller
	 * 
	 * 
	 * 
	 * */
	@Autowired
	UserService userservice;
	@Autowired
	AdminService adminservice;
	@Autowired
	questionService questionService;
	@Autowired
	answerService answerservice;
	@PostMapping("/addUser")
	public ModelAndView save(@RequestParam int uid, String fname, String lname, long mno, String address, Date dob) {
		ModelAndView mv=new ModelAndView("login");
		User u = new User();
		u.setUid(uid);
		u.setFname(fname);
		u.setLname(lname);
		u.setMno(mno);
		u.setAddress(address);
		u.setDob(dob);
		userservice.save(u);
		return mv;
		
	}

	@GetMapping("/userall")
	public ModelAndView ls1() {
		System.out.println("get all...");

		 List<User>ls= userservice.listall();
		 ModelAndView mv=new ModelAndView("userall");
		 mv.addObject("ls",ls);
		 
		 return mv;
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");

		return mv;

	}

	@RequestMapping("/finduser")
	public ModelAndView find(@RequestParam int uid) {
		ModelAndView mv = new ModelAndView("userDashboard");
		userservice.find(uid);
		 List<question>ls= questionService.listall();
		mv.addObject("uid",uid);
		mv.addObject("question",ls);
		System.out.println("found...");
	
		return mv;
	}
	@RequestMapping("/deleteuser")
	public ModelAndView deleteuser(@RequestParam int uid) {
		ModelAndView mv = new ModelAndView("adminDashboard");
		userservice.deleteuser(uid);
		System.out.println("deleted");
		return mv;
	}

	@RequestMapping("/newuser")
	public ModelAndView newuserpage() {
		ModelAndView mv = new ModelAndView("newuser");

		return mv;
	}
	/*
	 * 
	 * 
	 * answer controller
	 * 
	 * 
	 * */
	
	@PostMapping("/answer")
	public void save(@RequestBody answer answer) {
		System.out.println("save...");

			answerservice.save(answer);
		
	}
	@GetMapping("/answerAll")
	public List<answer> ls() {
		System.out.println("get all...");

		return answerservice.listall();
	}
	
	@RequestMapping("/countanswer")
	public ModelAndView countanswer() {
	ModelAndView mv=new ModelAndView("login");
//	List<question>questionList=questionService.listall();
//	Iterator<question>itr=questionList.iterator();
//	List<Integer>countanswer=new LinkedList<>();
//	while(itr.hasNext()) {
//		countanswer.add(answerservice.count(itr.next().getQuestion()));
//	}
//	mv.addObject("counts",countanswer);
//	mv.addObject("questionlist",questionList);
	return mv;
	}
//	@RequestMapping("/voteto")
//	public ModelAndView voteto(@RequestParam String question,int uid) {
//		ModelAndView mv=new ModelAndView("userDashboard");
//		answer vote=new answer();
////		User user=userservice.repo.findUserObject(uid);
//		Object ls=userservice.repo.findById(uid);
//		question p=new question();
//		p.setQuestion(question);
//		vote.setParty(p);
//		vote.setUser((User) ls);
//		answerservice.save(vote);
//		return mv;
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * admin controller
	 * 
	 * 
	 * 
	 * */
	
	@PostMapping("/admin")
	public void save(@RequestBody Admin admin) {
		System.out.println("save...");

		adminservice.save(admin);
		
	}
	@GetMapping("/adminall")
	public ModelAndView ls2() {
		System.out.println("get all...");

		 List<Admin>ls= adminservice.listall();
//		 Iterator<Admin> itr=ls.iterator();
//		 for (Admin admin : ls) {
//			System.out.println(admin.getAid());
//		}
		 ModelAndView mv=new ModelAndView("adminall");
		 mv.addObject("ls",ls);
		 
		 return mv;
	}
	@RequestMapping("/home")
	public String home() {
		return"home";
	}
	@RequestMapping("/findAdmin")
	public ModelAndView findAdmin(@RequestParam String name,String password ) {
		adminservice.findAdmin(name, password);
		ModelAndView mv=new ModelAndView("adminDashboard");
				return mv;
	}
	/*
	 *
	 *question controller
	 *
	 * 
	 * */
	

	@GetMapping("/question")
	public ModelAndView ls4() {
		System.out.println("get all...");

		 List<question>ls= questionService.listall();
		 ModelAndView mv=new ModelAndView("questions");
		 mv.addObject("ls",ls);
		 
		 return mv;
	}
	@RequestMapping("question")
	public ModelAndView questions() {
		ModelAndView mv=new ModelAndView("questions");
		return mv;
	}
	@PostMapping("/addquestion")
	public ModelAndView savequestion(@RequestBody String question) {
		System.out.println("save...");
		question q=new question();
		q.setQuestion(question);
		 ModelAndView mv=new ModelAndView("adminDashboard");

		questionService.savequestion(q);
		return mv;
		
	}
	@RequestMapping("/deletequestion")
	public ModelAndView deletequestion(@RequestParam int uid) {
		ModelAndView mv = new ModelAndView("adminDashboard");
		questionService.deletequestion(uid);
		System.out.println("deleted");
		return mv;
	}

}
