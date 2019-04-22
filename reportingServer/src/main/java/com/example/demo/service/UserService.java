package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userDao; 
	
    public User getUser(String email, String password) {
    	try {
    		return userDao.getUser(email, password);
    	} catch (Exception e) {
    		User bad = new User();
    		return bad;
    	}
    }
    
    public User getUser(int id) {
    	try {
    		return userDao.getUser(id);
    	} catch (Exception e) {
    		User bad = new User();
    		return bad;
    	}
    }
   
}
