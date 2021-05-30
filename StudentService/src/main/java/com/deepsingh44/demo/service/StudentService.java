package com.deepsingh44.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepsingh44.demo.dao.StudentRepository;
import com.deepsingh44.demo.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

}
