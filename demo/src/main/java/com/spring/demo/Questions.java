package com.spring.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Questions {

	@Id
	private int qid;
	
	private String question;
	private int marks;
	private int level;

	public Questions(){
		
	}
	
	public Questions(int qid, String question, int marks, int level) {
		super();
		this.qid = qid;
		this.question = question;
		this.marks = marks;
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Questions [qid=" + qid + ", question=" + question + ", marks=" + marks + ", level=" + level + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + level;
		result = prime * result + marks;
		result = prime * result + qid;
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Questions other = (Questions) obj;
		if (level != other.level)
			return false;
		if (marks != other.marks)
			return false;
		if (qid != other.qid)
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		return true;
	}

	

}
