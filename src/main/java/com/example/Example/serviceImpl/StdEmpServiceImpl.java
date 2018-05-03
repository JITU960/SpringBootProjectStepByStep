package com.example.Example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Example.entity.Employee;
import com.example.Example.entity.Student;
import com.example.Example.service.StdEmpService;
import com.example.Example.utils.PersistenceManager;

@Service
public class StdEmpServiceImpl implements StdEmpService	 {
	@Autowired
	PersistenceManager persistenceManager;
	
	@Override
	public void createStudent(Student student) {
		persistenceManager.createStudent(student);
	}

	@Override
	public Student findStudentById(int id) {
		return persistenceManager.getStudentById(id);
	}

	@Override
	public void createEmployee(Employee employee) {
		persistenceManager.createEmployee(employee);	
	}

	@Override
	public void updateEmployee(Employee employee) {
		persistenceManager.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		persistenceManager.deleteEmployee(employee);
	}

	@Override
	public Employee findEmployeeById(int id) {
		return persistenceManager.getEmployeeById(id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return persistenceManager.getAllEmployee();
	}
	
}
