package it.r27.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.r27.libreria.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
