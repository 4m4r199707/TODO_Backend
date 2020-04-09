package com.todo.restfullwebservice;

public class helloworldBean {
	
	private String message;
	
	public helloworldBean(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public String toString() {
		return String.format("HelloWorldBean [message=%s]", message);
	}
}
