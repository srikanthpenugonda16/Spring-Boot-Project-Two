package com.college.student.database.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.student.database.entity.StudentEntity;
import com.college.student.database.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public void saveDetails(StudentEntity student) {
		studentRepository.save(student);
	}

	public Optional<StudentEntity> findDetailsOfStudent(int id) {
		return studentRepository.findById(id);
	}

	public List<StudentEntity> findAllTheStudentDetails() {
		return studentRepository.findAll();
	}

	public void deleteTheStudentDetails(int id) {
		studentRepository.deleteById(id);
	}

	public void deleteAllTheStudentDetails() {
		studentRepository.deleteAll();
	}

	/*
	 * public StudentEntity updateDetailsOfStudent(int id) {
	 * findDetailsOfStudent(id); return null; }
	 */
}
