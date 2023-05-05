package com.student.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private long rollNumber;
	
	private String name;
	
	private String Email;
	
	private String branch;
	
	private String phoneNumber;
	
	private String address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(long rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", rollNumber=" + rollNumber + ", name=" + name + ", Email=" + Email + ", branch="
				+ branch + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}

	
	
	
	

}
