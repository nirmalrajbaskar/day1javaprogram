package com.tns.shopowner;

import jakarta.persistence.Column;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mallowner 
{
	@Id
	@Column(name="ownerid")
	private int ownerid;
	
	@Column(unique = true)
    private String username;
	
	@Column(nullable = false)
    private String password;
	
	@Column(unique = true)
    private String email;
	
	@Column(nullable = false)
    private String phone;
	
	@Column(name="address")
	private String address;

	public int getOwnerid() {
		return ownerid;
	}

	public void setOwnerid(int ownerid) {
		this.ownerid = ownerid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Mallowner(int ownerid, String username, String password, String email, String phone, String address) {
		super();
		this.ownerid = ownerid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Owner [ownerid=" + ownerid + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", phone=" + phone + ", address=" + address + "]";
	}

	
	
}

