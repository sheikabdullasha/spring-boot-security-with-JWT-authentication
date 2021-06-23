package com.sample.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sample.demo.entity.SecurityCustomer;
import com.sample.demo.entity.User;
import com.sample.demo.repo.UserRepository;
@Service
public class CustomUserDetailService implements UserDetailsService{
	
	@Autowired
	UserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<User> usr=repo.findByUserName(username);
		if(usr.size()==0) {
			throw new UsernameNotFoundException("user detail not found for the user "+ username);
		}
		
		// TODO Auto-generated method stub
		return new SecurityCustomer(usr.get(0));
	}

}
