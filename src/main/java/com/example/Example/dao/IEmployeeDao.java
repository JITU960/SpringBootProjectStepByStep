package com.example.Example.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Example.entity.Employee;

@Repository
public interface IEmployeeDao {
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int empId);
	public void createEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public void deleteEmployee(Employee emp);
}
