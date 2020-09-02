package com.lzjt.po;

public class user {
	int id;
	String user_name;
	String passwd;
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	public user(int id, String user_name, String passwd) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.passwd = passwd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
}
