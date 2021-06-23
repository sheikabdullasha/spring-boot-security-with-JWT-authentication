package com.sample.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_TBL")
public class User {
	@Id
	private int id;
	private String userName;
	private String passWord;
	private String gmail;
	public User(int id, String userName, String passWord, String gmail) {
		
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.gmail = gmail;
	}
	
	
	public User() {

	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	
	

}
