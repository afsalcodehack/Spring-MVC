package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Respository.UserDataRepository;
import entity.TblUser;
import net.minidev.json.JSONArray;

@RestController
public class HomeController {

	@CrossOrigin(origins = "http://127.0.0.1:8080")
	@RequestMapping("/hello")
	public List<TblUser> hello(@RequestParam String name) {
        
		UserDataRepository user = new UserDataRepository();
		
		List<TblUser>  users = user.GetUser();

		
         return users;
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:8080")
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public TblUser hello1(@RequestBody TblUser model) {	
		
		model.setName(model.getName() + "i love u");
		
		return  model;
	}
}