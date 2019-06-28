package com.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.Service.UserService;
import com.jt.pojo.User;
@RestController
public class UsrController {
	@Autowired
	private UserService userservice;
	
	@RequestMapping("findAll")
	public List<User> findAll(){
		return userservice.findAll();

		
	}

}
