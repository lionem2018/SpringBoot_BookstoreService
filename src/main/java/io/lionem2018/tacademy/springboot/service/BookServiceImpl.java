package io.lionem2018.tacademy.springboot.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import io.lionem2018.tacademy.springboot.domain.Book;
import io.lionem2018.tacademy.springboot.domain.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	private final BookRepository bookRepository;
	
	public BookServiceImpl(BookRepository bookRepository)
	{
		this.bookRepository = bookRepository;
	}
	
	@Override
	public Optional<Book> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
