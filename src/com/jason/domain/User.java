package com.jason.domain;
import java.util.Date;


public class User {
	private String username;
	private String name;
	private int age;
	private long id; 
	private Date date;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", name=" + name + ", age=" + age
				+ ", id=" + id + ", date=" + date + "]";
	}
	

	
	
}
