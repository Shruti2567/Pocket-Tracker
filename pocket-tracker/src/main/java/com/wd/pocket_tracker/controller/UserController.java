package com.wd.pocket_tracker.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wd.pocket_tracker.entity.LoginRequest;
import com.wd.pocket_tracker.entity.User;

@RequestMapping("/api/v1/user-management")
public interface UserController {

	@PostMapping("/register")
	ResponseEntity<User> signUp(@RequestBody User user) ;
	
	@PostMapping("/login")
	ResponseEntity<?> login(@RequestBody LoginRequest loginRequest);
	
	@GetMapping("/users/{id}")
	ResponseEntity<User> getById(@PathVariable Integer id);
	
	@GetMapping("/users")
	ResponseEntity<List<User>> getAllUsers();
	
	@DeleteMapping("/users/{id}")
	ResponseEntity<?> deleteUser(@PathVariable Integer id);
	
	@PatchMapping("/users/{id}")
	ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody User user);
}
