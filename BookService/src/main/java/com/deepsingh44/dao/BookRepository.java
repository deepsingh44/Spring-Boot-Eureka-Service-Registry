package com.deepsingh44.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepsingh44.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
