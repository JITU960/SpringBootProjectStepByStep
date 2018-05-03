package com.example.Example.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Employee {
	private int id;
	private String name;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	private String mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob
				+ ", mobile=" + mobile + "]";
	}
	
}
