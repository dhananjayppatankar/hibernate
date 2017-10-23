package com.spring.demo;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeDetails {
	
	
	private int empdetailid;
	//@GeneratedValue(generator="newGenerator")
	//@GenericGenerator(name="newGenerator", strategy="foreign", parameters= {@Parameter(name="employee" ,value="property")} )
	
	
	private String eaddress;
	

//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="eid")
	//private Employee employee;
	
	

	public int getEmpdetailid() {
		return empdetailid;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [empdetailid=" + empdetailid + ", eaddress=" + eaddress + "]";
	}

	public void setEmpdetailid(int empdetailid) {
		this.empdetailid = empdetailid;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

//	public Employee getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
//
//	@Override
//	public String toString() {
//		return "EmployeeDetails [empdetailid=" + empdetailid + ", eaddress=" + eaddress + ", employee=" + employee + "]";
//	}
	
	
	
	
	
	
	
}
