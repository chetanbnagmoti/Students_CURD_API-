package com.in.student.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.in.student.dto.Student;
import com.in.student.entity.StudentEntity;
import com.in.student.repository.StudentRepository;

@Service
public class StudentImplement implements StudentServices{

	
	   @Autowired
	   StudentRepository   studentRepository;
	   
	   
	@Override
	public boolean addStudent(Student objStudent) {
		StudentEntity  entity =new StudentEntity();
		BeanUtils.copyProperties(objStudent, entity);
		studentRepository.save(entity);
		return true;
	}  


	@Override
	public List<Student> getAllStudent() {
		List<StudentEntity> entity =studentRepository.findAll();
		ArrayList<Student> list =new ArrayList<>();
		for(StudentEntity student:entity) {
			Student studentDto =new Student();
			BeanUtils.copyProperties(student,studentDto);
			list.add(studentDto);
		}
		return list;
	}


	@Override
	public Student updateStudent(Student student) {
	    Optional<StudentEntity> optionalStudentEntity = studentRepository.findById(student.getId());

	    if (optionalStudentEntity.isPresent()) {
	        StudentEntity studentEntity = optionalStudentEntity.get();

	        // Perform the necessary updates on the student entity here
	        studentEntity.setName(student.getName());
	        studentEntity.setMobileNumber(student.getMobileNumber());
	        studentEntity.setCity(student.getCity());
	        studentEntity.setAddress(student.getAddress());

	        // Save the updated student entity
	        StudentEntity updatedStudentEntity = studentRepository.save(studentEntity);

	        // Convert the entity to a DTO
	        Student updatedStudent = new Student();
	        BeanUtils.copyProperties(updatedStudentEntity, updatedStudent);

	        return updatedStudent; // Return the updated student DTO
	    } else {
	        // Handle the case when a student entity with the given ID is not found
	        // You can throw an exception or return null, depending on your use case
	        return null;
	    }
	}


	@Override
	public Integer deleteStudent(int id) {
	    Optional<StudentEntity> optionalStudentEntity = studentRepository.findById(id);

	    if (optionalStudentEntity.isPresent()) {
	        StudentEntity studentEntity = optionalStudentEntity.get();

	        // Delete the student entity
	        studentRepository.delete(studentEntity);

	        return studentEntity.getId();
	    } else {
	        // Handle the case when a student entity with the given ID is not found
	        // You can throw an exception or return null, depending on your use case
	        return null;
	    }
	}



	
}
