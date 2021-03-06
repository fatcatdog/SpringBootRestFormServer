package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.User;

@Transactional
@Repository
public class UserRepo {
	 
		private final JdbcTemplate jdbcTemplate;
	    
	    @Autowired
	    public UserRepo(JdbcTemplate jdbcTemplate) {
		  this.jdbcTemplate = jdbcTemplate;
	    }
	    
	    public User getUser(String email, String password) {
	    	String sql = "SELECT id, email, password, name FROM User WHERE email = ?";
	    	RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
	    	
	    	User user = jdbcTemplate.queryForObject(sql, rowMapper, email);
	    	
	    	if (user.getPassword().equals(password)) {
	    		return user; 
	    	} else {
	    		User fakeUser = new User(); 
	    		return fakeUser;
	    	}
		}
	    
	    public User getUser(int id) {
	    	String sql = "SELECT id, email, password, name FROM User WHERE id = ?";
	    	RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
	    	
	    	try {
	    		User user = jdbcTemplate.queryForObject(sql, rowMapper, id);
		    	
		    	
		    	return user;
	    	} catch (Exception e) {
	    		return new User(); 
	    	}
	    	
		}
}
