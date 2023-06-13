package com.in.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.in.student.dto.Student;
import com.in.student.services.StudentServices;

@RestController
@RequestMapping("/student")
public class StudentController {
       
	
	 @Autowired
	 StudentServices studentServices;
	 
	 @PostMapping("/add")
	 public boolean addStudent(@RequestBody Student objStudent) {	  
		return studentServices.addStudent(objStudent);	 
	 }
	 
	@GetMapping("/get") 
	public List<Student> getAllStudent() {
		return studentServices.getAllStudent();	
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
	    student.setId(id);
	    return studentServices.updateStudent(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public Integer deleteStudent(@PathVariable int id) {
	    return studentServices.deleteStudent(id);
	}
	
	     
}
