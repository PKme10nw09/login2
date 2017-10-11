package com.internousdev.login2.dto;

public class LoginDTO {
	private String username;
	private String password;
	private String email;
	private String address;
	private String age;


	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getaddress(){
		return address;
	}
	public void setaddress(String address){
		this.address = address;
	}
	public String getAge(){
		return age;
	}
	public void setAge(String age){
		this.age = age;
	}
}
