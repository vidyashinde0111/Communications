package com.springboot.rest.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.rest.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	
	public User findByUserId(String userId);
	
	/* public UserDto saveUser(List<User> list); */

}
