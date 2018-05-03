package com.example.Example.utils;

import lombok.experimental.Delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Example.dao.IEmployeeDao;
import com.example.Example.dao.IStudentDao;

@Repository
public class PersistenceManager {
	@Delegate
	@Autowired
	IEmployeeDao employeeDao;
	
	@Autowired
	@Delegate
	IStudentDao	studentDao;
}
