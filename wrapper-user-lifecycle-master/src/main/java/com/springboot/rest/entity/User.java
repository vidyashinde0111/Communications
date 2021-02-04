package com.springboot.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.AnnotationException;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
//@Table(name = "user_table")
public class User {

	@Id
	@Column
	private String userId;
	
	@Column
	private String userName;
	
	public User() {
		
	}
	
	public User(String userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
