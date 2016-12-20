package com.denofprogramming.service;

public class BasicMessageOfTheDayImpl implements MessageOfTheDayService {
	
	private String message;
	
	public String getMessage() {		
		return message;
	}

	public void setMessage(String message){
		this.message = message;
	}
	
	public void init() {
		System.out.println("Init called");
	}
	
}
