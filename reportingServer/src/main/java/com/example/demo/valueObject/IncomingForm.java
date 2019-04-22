package com.example.demo.valueObject;

public class IncomingForm {
	int id; 
	int userId; 
	int answerQuestion1; 
	int answerQuestion2; 
	String answerQuestion3; 
	String answerQuestion4; 
	String email; 
	String password;
	
	public IncomingForm() {}
	
	public IncomingForm(int id, int userId, int answerQuestion1, int answerQuestion2, String answerQuestion3,
			String answerQuestion4, String email, String password) {
		super();
		this.id = id;
		this.userId = userId;
		this.answerQuestion1 = answerQuestion1;
		this.answerQuestion2 = answerQuestion2;
		this.answerQuestion3 = answerQuestion3;
		this.answerQuestion4 = answerQuestion4;
		this.email = email;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getAnswerQuestion1() {
		return answerQuestion1;
	}
	public void setAnswerQuestion1(int answerQuestion1) {
		this.answerQuestion1 = answerQuestion1;
	}
	public int getAnswerQuestion2() {
		return answerQuestion2;
	}
	public void setAnswerQuestion2(int answerQuestion2) {
		this.answerQuestion2 = answerQuestion2;
	}
	public String getAnswerQuestion3() {
		return answerQuestion3;
	}
	public void setAnswerQuestion3(String answerQuestion3) {
		this.answerQuestion3 = answerQuestion3;
	}
	public String getAnswerQuestion4() {
		return answerQuestion4;
	}
	public void setAnswerQuestion4(String answerQuestion4) {
		this.answerQuestion4 = answerQuestion4;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	} 
	
	
}
