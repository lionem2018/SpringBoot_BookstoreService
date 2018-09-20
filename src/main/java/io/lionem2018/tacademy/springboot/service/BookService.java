package io.lionem2018.tacademy.springboot.service;

import java.util.Optional;

import io.lionem2018.tacademy.springboot.domain.Book;

public interface BookService {
	
	Optional<Book> findById(Long id);
}
