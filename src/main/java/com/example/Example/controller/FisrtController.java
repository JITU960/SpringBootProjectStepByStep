package com.example.Example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Example.entity.Employee;
import com.example.Example.entity.Student;
import com.example.Example.service.StdEmpService;

@RestController
public class FisrtController {
	@Autowired
	StdEmpService stdEmpService;
	
	@RequestMapping("employee/{empId}")
	public Employee getEmployeeById(@PathVariable("empId") int empId) {
		return stdEmpService.findEmployeeById(empId);
	}
	
	@RequestMapping(value = "create-emp", method=RequestMethod.POST)
	public void postCreateEmployee(@ModelAttribute("emp") Employee emp) {
		stdEmpService.createEmployee(emp);
	}
	
	@RequestMapping(value = "create-std", method=RequestMethod.POST)
	public void postCreateStudent(@ModelAttribute("std") Student std) {
		stdEmpService.createStudent(std);
	}
	
	@RequestMapping(value="student/{studentId}")
	public Student getStudentById(@PathVariable("studentId") int studentId) {
		return stdEmpService.findStudentById(studentId);
	}
	
	@RequestMapping(value="delete-employee", method=RequestMethod.POST)
	public void deleteEmployee(Employee emp) {
		stdEmpService.deleteEmployee(emp);
	}
	
	@RequestMapping(value="update-employee", method=RequestMethod.POST)
	public void updateEmployee(Employee emp) {
		stdEmpService.updateEmployee(emp);
	}
	
	@RequestMapping(value="employee/all")
	public List<Employee> getAllEmployee() {
		return stdEmpService.getAllEmployee();
	}
	
}
