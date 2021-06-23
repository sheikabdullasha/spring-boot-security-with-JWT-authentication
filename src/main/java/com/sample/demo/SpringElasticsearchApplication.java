package com.sample.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sample.demo.entity.User;
import com.sample.demo.repo.UserRepository;

@SpringBootApplication
public class SpringElasticsearchApplication {
	
	@Autowired
	private UserRepository repo;
	/*@PostConstruct
	public void initUsers() {
		List<User> users=Stream.of(
				new User(101,"sheik","abu","sheik@gmail.com"),
				new User(102,"remi","inf","remi@gmail.com")
				).collect(Collectors.toList());
		repo.saveAll(users);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(SpringElasticsearchApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			User usr1=new User(101,"sheik","abu","sheik@gmail.com");
					
			
			User usr2=new User(102,"remi","inf","remi@gmail.com");
			
		
			
			repo.save(usr1);
			repo.save(usr2);
			
			
		};
	}

}
