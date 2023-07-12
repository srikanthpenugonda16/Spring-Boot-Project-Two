package com.college.student.database.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.student.database.entity.StudentEntity;
import com.college.student.database.service.StudentService;

@RestController
@RequestMapping("/student/controller")
public class StudentController {

	
	@Autowired
	StudentService studentService; 
	
	@RequestMapping("/save/student/data")
	public ResponseEntity<StudentEntity> saveStudentData(@RequestBody StudentEntity studentEntity) 
	{ 
 		return new ResponseEntity<StudentEntity>(studentEntity, HttpStatus.OK);
	}                                          
	
	@RequestMapping("/find/{id}")
	public ResponseEntity<Optional<StudentEntity>> find(@PathVariable("id") int id)
	{
		Optional<StudentEntity> student = studentService.findDetailsOfStudent(id);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
	
	@RequestMapping("/find/all")
	
	public ResponseEntity<List<StudentEntity>> findAll()
	{
	List<StudentEntity> listOfStudents = studentService.findAllTheStudentDetails();
		
		return new ResponseEntity<List<StudentEntity>>(listOfStudents, HttpStatus.OK) ;
	}
	
	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id )
	{
		studentService.deleteTheStudentDetails(id);
		
	}
	
	@RequestMapping("/delete/all")
	public void deleteAll()
	{
		studentService.deleteAllTheStudentDetails();
		
	}
	               
/*
 	@RequestMapping("/update/{id}")
	public ResponseEntity<StudentEntity> update(@PathVariable("id") int id)
	{
		StudentEntity student=studentService.updateDetailsOfStudent(id);
		return null;
	}        
*/           
	    
	
	
}                                                                                                     
                                                                  
                      