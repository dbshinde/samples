package com.dj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	@Column
	private String firstName;
	@Column
	private int yearLevel;
	@Column
	private String lastName;
	
	
	public Student() {}
	public Student(int studentId, String firstName, int yearLevel,String lastName) 
	{
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.yearLevel = yearLevel;
		this.lastName = lastName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getYearLevel() {
		return yearLevel;
	}
	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
