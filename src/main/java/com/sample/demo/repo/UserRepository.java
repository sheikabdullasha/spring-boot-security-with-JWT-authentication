package com.sample.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.demo.entity.User;


public interface UserRepository extends JpaRepository<User, Integer>{

	List<User> findByUserName(String username);

}
