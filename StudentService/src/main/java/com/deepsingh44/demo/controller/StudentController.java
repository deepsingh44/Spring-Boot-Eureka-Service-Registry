package com.deepsingh44.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepsingh44.demo.model.Student;
import com.deepsingh44.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}

	@GetMapping("/students")
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}

}
