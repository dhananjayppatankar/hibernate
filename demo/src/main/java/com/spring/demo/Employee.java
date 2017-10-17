package com.spring.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int eid;
	
	@Column(name="ename")
	private String ename;
	
	@Column(name="esalary")
	private double esalary;
	
	@Column(name="empdetails")
	private EmployeeDetails empdetails;
	
	
	
	
	
	public EmployeeDetails getEmpdetails() {
		return empdetails;
	}
	public void setEmpdetails(EmployeeDetails empdetails) {
		this.empdetails = empdetails;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
	
	
	
}
