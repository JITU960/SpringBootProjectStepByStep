package com.example.Example.service;

import java.util.List;

import com.example.Example.entity.Employee;
import com.example.Example.entity.Student;

public interface StdEmpService {
	public void createStudent(Student student);
	public Student findStudentById(int id);
	public void createEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public Employee findEmployeeById(int id);
	public List<Employee> getAllEmployee();
}
