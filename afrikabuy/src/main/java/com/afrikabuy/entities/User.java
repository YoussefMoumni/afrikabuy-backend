package com.afrikabuy.entities;

import java.util.Date;

import javax.persistence.*;

/**
 * @author Youssef Moumni
 *
 */
	@Entity
public class User {

	@Id
	@GeneratedValue
	private int  Id;
	private String Login;
	private String Fname;
	private String Lname;
	private Date Birthday;
	private String Email;
	private String Password;
	private String country;
	private String city;
	private int Mobile1;
	private int Mobile2;
	
	
	public User(String L,String Fn,String Ln,String Login,Date birth,String email,String password) 
	{
		this.Login=L;
		this.Fname=Fn;
		this.Lname=Ln;
		this.Birthday=birth;
		this.Password=password;
	}


	public String getLogin() {
		return Login;
	}


	public void setLogin(String login) {
		Login = login;
	}


	public String getFname() {
		return Fname;
	}


	public void setFname(String fname) {
		Fname = fname;
	}


	public String getLname() {
		return Lname;
	}


	public void setLname(String lname) {
		Lname = lname;
	}


	public Date getBirthday() {
		return Birthday;
	}


	public void setBirthday(Date birthday) {
		Birthday = birthday;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}
	
	
	
}
