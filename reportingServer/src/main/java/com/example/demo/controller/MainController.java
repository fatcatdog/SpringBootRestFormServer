package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FormData;
import com.example.demo.model.User;
import com.example.demo.service.FormDataService;
import com.example.demo.valueObject.IncomingForm;

@RestController
@RequestMapping("/forms")
public class MainController {
	
	  
	  @Autowired
	  private FormDataService formDataService;
	
	  @PostMapping("/login")
	  @CrossOrigin(origins = "http://localhost:3000")
	  public ResponseEntity<?> tryLogin(@Valid @RequestBody User user) {
	
		  String email = user.getEmail();
		  String password = user.getPassword();
		  
		  System.out.println("email: " + email);
		  System.out.println("password: " + password);

		  if(email.length() > 1 && password.length() > 1) {
		  		return new ResponseEntity<>("valid email and user request", HttpStatus.OK);
		  } else {
	    		return new ResponseEntity<>("not valid", HttpStatus.BAD_REQUEST);
		  }

	  }
	  
	  
	  
	  @PostMapping("/create")
	  public ResponseEntity<?> createForm(@Valid @RequestBody IncomingForm incomingForm) {
		  
		  FormData tempForm = new FormData(); 
		  User tempUser = new User(); 
		  
		  try {
			  tempForm.setAnswerQuestion1(incomingForm.getAnswerQuestion1());
			  tempForm.setAnswerQuestion2(incomingForm.getAnswerQuestion2());
			  tempForm.setAnswerQuestion3(incomingForm.getAnswerQuestion3());
			  tempForm.setAnswerQuestion4(incomingForm.getAnswerQuestion4());
		 
			  tempUser.setEmail(incomingForm.getEmail());
			  tempUser.setPassword(incomingForm.getPassword());
		  } catch(Exception e) {
			  System.out.println(e);
		  }
		 
		  try {
			  formDataService.saveForm(tempForm, tempUser.getEmail(), tempUser.getPassword());
			
	    		return new ResponseEntity<>("Save form endpoint success", HttpStatus.OK);
		  } catch (Exception e) {
	    		return new ResponseEntity<>("Save form end point failed", HttpStatus.BAD_REQUEST);
		  }
	  }
	  
	    @GetMapping("/{id}")
	    public ResponseEntity<?> getForm(@PathVariable int id){
	    	try {
	    		FormData tempForm = formDataService.getForm(id);
	    		return new ResponseEntity<>(tempForm, HttpStatus.OK);	
	    	} catch(Exception e) {
	    		return new ResponseEntity<>("Get form end point failed", HttpStatus.BAD_REQUEST);
	    	}
	    }
	   
	    @PostMapping("/update/{id}")
	    public ResponseEntity<?> updateForm(@PathVariable int id, @Valid @RequestBody IncomingForm incomingForm){
	    	 FormData tempForm = new FormData(); 
			  User tempUser = new User(); 
			  
			  try {
				  tempForm.setId(incomingForm.getId());
				  tempForm.setUserId(incomingForm.getUserId());
				  tempForm.setAnswerQuestion1(incomingForm.getAnswerQuestion1());
				  tempForm.setAnswerQuestion2(incomingForm.getAnswerQuestion2());
				  tempForm.setAnswerQuestion3(incomingForm.getAnswerQuestion3());
				  tempForm.setAnswerQuestion4(incomingForm.getAnswerQuestion4());
				  tempUser.setEmail(incomingForm.getEmail());
				  tempUser.setPassword(incomingForm.getPassword());
			  } catch(Exception e) {
				  System.out.println(e);
			  }
	    	
	    	try {
	    		if (tempForm.getId() != id) {
	    			System.out.println("tempForm id: " + tempForm.getId());
	    			System.out.println("path var id: " + id);

		    		return new ResponseEntity<>("Update form end point failed because of hacker...", HttpStatus.BAD_REQUEST);
	    		}
	    		formDataService.updateForm(tempForm, tempUser.getEmail(), tempUser.getPassword());
	    		return new ResponseEntity<>(HttpStatus.OK);	
	    	} catch(Exception e) {
	    		return new ResponseEntity<>("Update form end point failed", HttpStatus.BAD_REQUEST);
	    	}
	    }

}
