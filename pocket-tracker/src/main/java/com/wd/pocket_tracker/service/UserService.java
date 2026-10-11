package com.wd.pocket_tracker.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.wd.pocket_tracker.entity.User;
import com.wd.pocket_tracker.exception.UserNotFoundException;
import com.wd.pocket_tracker.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	 public User saveUser(User user) {
		 user.setCreatedAt(LocalDateTime.now());
	        return userRepository.save(user);
	    }
	 
	 public User getById(int id) {
		 Optional<User> optionalUser = userRepository.findById(id);
		 if (optionalUser.isPresent()) {
			return optionalUser.get();
		} else {
			throw new UserNotFoundException(HttpStatus.NOT_FOUND,"User with id: "+ id + " not found");
		}
	 }
	 
	 public List<User> getAllUser(){
		 List<User> users= userRepository.findAll();
		 return users;
	 }
	 
}
