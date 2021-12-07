package com.app.core.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Contact")
public class Contact {
	
//	@OneToOne(mappedBy = "Contact", orphanRemoval = true)
//	private int uId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int contactId;
	private int moblieNo;
	private String city;
	private String state;
	
	@OneToOne(mappedBy = "contactNo",cascade = CascadeType.ALL,orphanRemoval = true)
	private Una_Employee userId;
	
//	@JoinColumn(name = "unaId")
//	@OneToOne
//	private Una_Employee userId;

	public Una_Employee getuId() {
		return userId;
	}

	public void setuId(Una_Employee uId) {
		this.userId = uId;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public int getMoblieNo() {
		return moblieNo;
	}

	public void setMoblieNo(int moblieNo) {
		this.moblieNo = moblieNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	
	
	
}
