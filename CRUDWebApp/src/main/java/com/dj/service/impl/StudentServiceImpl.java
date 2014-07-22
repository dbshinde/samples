package com.dj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dj.dao.StudentDao;
import com.dj.model.Student;
import com.dj.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao ;
	
	@Transactional
	public void add(Student student) 
	{
		studentDao.add(student);
	}

	@Transactional
	public void edit(Student student) 
	{
		studentDao.edit(student);
	}

	@Transactional
	public void delete(int studentId) 
	{
		studentDao.delete(studentId);
	}

	@Transactional
	public Student getStudent(int studentId) {
		return studentDao.getStudent(studentId);
	}

	@Transactional
	public List getAllStudents() {
		return studentDao.getAllStudents();
	}

}
