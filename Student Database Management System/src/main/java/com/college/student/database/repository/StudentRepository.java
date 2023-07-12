package com.college.student.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.student.database.entity.StudentEntity;


@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

	
	
}
