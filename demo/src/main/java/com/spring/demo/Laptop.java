package com.spring.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {

	@Id
	private int lid;
	private String lmodel;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLmodel() {
		return lmodel;	
	}

	public void setLmodel(String lmodel) {
		this.lmodel = lmodel;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lmodel=" + lmodel + "]";
	}

}
