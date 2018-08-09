package com.example.DemoGraphQL.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.DemoGraphQL.model.Author;
import com.example.DemoGraphQL.model.Book;

public interface AuthorRepository extends CrudRepository<Author, Long> {
	
	@Query("SELECT b FROM Book AS b INNER JOIN b.author as a where a.id = ?")
	public List<Book> getAllBookByAuthor(Long id);
}
