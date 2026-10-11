package com.wd.pocket_tracker.controller.impl;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.wd.pocket_tracker.controller.UserController;
import com.wd.pocket_tracker.entity.LoginRequest;
import com.wd.pocket_tracker.entity.User;
import com.wd.pocket_tracker.exception.UserNotFoundException;
import com.wd.pocket_tracker.service.UserService;

@RestController
public class UserControllerimpl implements UserController{

	@Autowired
	private UserService userService;
	@Override
	public ResponseEntity<User> signUp(User user) {
		User savedUser = userService.saveUser(user);
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("{/id}")
				.buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(uri).body(user);
	}

	@Override
	public ResponseEntity<?> login(LoginRequest loginRequest) {
		return null;
	}

	@Override
	public ResponseEntity<User> getById(Integer id) {
		User user= userService.getById(id);
		return ResponseEntity.ok().body(user);
	}

	@Override
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> users =userService.getAllUser();
		if (!users.isEmpty()) {
			return ResponseEntity.ok().body(users) ;
		}
		throw new UserNotFoundException(HttpStatus.NOT_FOUND,"No user present ");
	}

	@Override
	public ResponseEntity<?> deleteUser(Integer id) {
		return null;
	}

	@Override
	public ResponseEntity<User> updateUser(Integer id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
