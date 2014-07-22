package com.dj.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.dj.dao.StudentDao;
import com.dj.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	private SessionFactory session;

	@Override
	public void add(Student student) 
	{
		session.getCurrentSession().save(student);
	}

	@Override
	public void edit(Student student) 
	{
		session.getCurrentSession().update(student);
	}

	@Override
	public void delete(int studentId) 
	{
		session.getCurrentSession().delete(getStudent(studentId));
	}

	@Override
	public Student getStudent(int studentId) 
	{
		return (Student) session.getCurrentSession().get(Student.class, studentId);
	}

	@Override
	public List getAllStudents() 
	{
		return session.getCurrentSession().createQuery("from Student").list();
	}

}
