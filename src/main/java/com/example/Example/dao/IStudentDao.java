package com.example.Example.dao;

import com.example.Example.entity.Student;

public interface IStudentDao {
	public Student getStudentById(int empId);
	public void createStudent(Student emp);
}
