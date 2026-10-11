package com.wd.pocket_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wd.pocket_tracker.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
