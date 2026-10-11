package com.wd.pocket_tracker.exception;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Map<String,String>> handleUserNotFound(UserNotFoundException ex){
		Map<String, String> error = Map.of("message",ex.getMessage(),
				"status",String.valueOf(ex.getCode()));
		return ResponseEntity.status(ex.getCode())
				.body(error) ;
	}
}
