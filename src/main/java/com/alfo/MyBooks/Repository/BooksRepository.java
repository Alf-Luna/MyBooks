package com.alfo.MyBooks.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alfo.MyBooks.Model.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer>{

}
