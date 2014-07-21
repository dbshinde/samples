package com.dineshonjava.bean;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Dinesh Rajput
 *
 */
public class EmployeeBean {
	private Integer id;
	@NotEmpty
	private String name;
	@NotEmpty
	private Integer age;
	@NotEmpty
	private Long salary;
	@NotEmpty
	private String address;
	
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
