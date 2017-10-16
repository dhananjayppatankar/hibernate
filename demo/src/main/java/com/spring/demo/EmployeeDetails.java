package com.spring.demo;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class EmployeeDetails {
	
	
	private int sid;
	
	@Column(name="saddress")
	private String saddress;
	
	@JoinColumn(name="sid")
	@OneToOne
	private Employee emp;
	
	
	
}
