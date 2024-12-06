package com.cjc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.model.Student;
import com.cjc.servieI.StudServiceI;

@RequestMapping("/enquiry")
@RestController
public class StudController 
{
	@Autowired StudServiceI si;
	
	@PostMapping("/saveStudentEnquiry")
	public ResponseEntity<Student> onsaveEnquiry(@RequestBody Student student)
	{
		Student enquiryRef=si.saveEnquiry(student);
		return new ResponseEntity<Student>(enquiryRef,HttpStatus.OK);
	}
	
	
}
