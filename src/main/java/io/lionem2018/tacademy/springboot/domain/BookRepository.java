package io.lionem2018.tacademy.springboot.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//@Repository ������̼� ���� �ʿ� X
public interface BookRepository extends JpaRepository<Book, Long> {
	
	List<Book> findByNameLike(String name);
	
}
