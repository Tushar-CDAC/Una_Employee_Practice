package com.app.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Una_Employee")
public class Una_Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int uId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	
	//@OneToOne(mappedBy = "userId")
	//private Contact contactNo;
	//private Una_Employee userId;
	
	@JoinColumn(name = "cId")
	@OneToOne
	private Contact contactNo;
	
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Contact getContact() {
		return contactNo;
	}
	public void setContact(Contact contact) {
		this.contactNo = contact;
	}
	
		
	
	
}
