package io.lionem2018.tacademy.springboot.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//@Repository 어노테이션 선언 필요 X
public interface BookRepository extends JpaRepository<Book, Long> {
	
	List<Book> findByNameLike(String name);
	
}
