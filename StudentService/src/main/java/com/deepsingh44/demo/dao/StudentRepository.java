package com.deepsingh44.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepsingh44.demo.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
