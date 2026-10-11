package com.wd.pocket_tracker.exception;

import org.springframework.http.HttpStatus;

public class UserNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HttpStatus code;
	private String message;
	
	public UserNotFoundException() {
	}

	public UserNotFoundException(HttpStatus code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public HttpStatus getCode() {
		return code;
	}

	public void setCode(HttpStatus code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
