package com.in.student.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.in.student.entity.StudentEntity;


@Repository
public interface StudentRepository extends  JpaRepository<StudentEntity, Integer> {

	
	// Native Query:-Decided on nativeQuery=true
		@Query(value = "select id from student", nativeQuery = true)
		public StudentEntity updateStudent(@Param("id") int id);
}
