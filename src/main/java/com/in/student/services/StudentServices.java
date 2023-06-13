package com.in.student.services;

import java.util.List;



import com.in.student.dto.Student;

public interface StudentServices {
       
	     public boolean addStudent(Student objStudent);
	     
	     public List<Student> getAllStudent();
	     
	     public Student updateStudent(Student objStudent);
	    
	     
	     Integer deleteStudent(int id);
}
