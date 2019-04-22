package com.example.demo.model;

public class FormData {

	int id; 
	int userId; 
	int answerQuestion1;
	int answerQuestion2;
	String answerQuestion3;
	String answerQuestion4;
	
	public FormData(int id, int userId, int answerQuestion1, int answerQuestion2, String answerQuestion3,
			String answerQuestion4) {
		super();
		this.id = id;
		this.userId = userId;
		this.answerQuestion1 = answerQuestion1;
		this.answerQuestion2 = answerQuestion2;
		this.answerQuestion3 = answerQuestion3;
		this.answerQuestion4 = answerQuestion4;
	}
	
	public FormData(int answerQuestion1, int answerQuestion2, String answerQuestion3,
			String answerQuestion4) {
		super();
		this.answerQuestion1 = answerQuestion1;
		this.answerQuestion2 = answerQuestion2;
		this.answerQuestion3 = answerQuestion3;
		this.answerQuestion4 = answerQuestion4;
	}
	
	
	@Override
	public String toString() {
		return "FormData [id=" + id + ", userId=" + userId + ", answerQuestion1=" + answerQuestion1
				+ ", answerQuestion2=" + answerQuestion2 + ", answerQuestion3=" + answerQuestion3 + ", answerQuestion4="
				+ answerQuestion4 + "]";
	}

	public FormData() {}
	
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
	
}
