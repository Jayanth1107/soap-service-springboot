package com.jayanth.soapservicespringboot.service;

import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.jayanth.soapservicespringboot.sources.User;

@Service
public class UserService {
	
	private static final HashMap<String, User> user = new HashMap<>();
	
	@PostConstruct
	public void initialize() {
		User user1 = new User();
		user1.setEmpId(11075356);
		user1.setName("Jayanth");
		user1.setSalary(35000.00);
		
		user.put(user1.getName(), user1);
		
		User user2 = new User();
		user2.setEmpId(11075356);
		user2.setName("user2");
		user2.setSalary(37000.00);
		
		user.put(user2.getName(), user1);
		
		User user3 = new User();
		user3.setEmpId(11075356);
		user3.setName("user3");
		user3.setSalary(38000.00);
		
		user.put(user3.getName(), user1);
	}
	
	public User getUsers(String name) {
		return user.get(name);
	}

}
