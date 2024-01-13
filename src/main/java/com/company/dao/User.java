package com.company.dao;

public class User {
  public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmails() {
		return email;
	}
	public void setEmails(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
private String username;
  private String email;
  private String password;

}
