package com.deepsingh44.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deepsingh44.demo.model.Book;
import com.deepsingh44.demo.model.Student;

@RestController
public class DucatController {

	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student student) {
		RestTemplate rest = new RestTemplate();
		return rest.postForObject("http://STUDENTSERVICE/student/add", student, Student.class);
	}

	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book book) {
		RestTemplate rest = new RestTemplate();
		return rest.postForObject("http://BOOKSERVICE/book/add", book, Book.class);
	}

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		RestTemplate rest = new RestTemplate();
		return rest.getForObject("http://BOOKSERVICE/book/books", List.class);
	}

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		RestTemplate rest = new RestTemplate();
		return rest.getForObject("http://STUDENTSERVICE/student/students", List.class);
	}
}
