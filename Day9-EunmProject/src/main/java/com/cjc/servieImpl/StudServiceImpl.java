package com.cjc.servieImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.StudRepository;
import com.cjc.servieI.StudServiceI;

@Service
public class StudServiceImpl implements StudServiceI
{
	@Autowired private StudRepository sr;

	@Override
	public Student saveEnquiry(Student student)
	{
		return sr.save(student);
	}

}
