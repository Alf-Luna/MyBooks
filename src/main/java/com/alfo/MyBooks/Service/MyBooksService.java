package com.alfo.MyBooks.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alfo.MyBooks.Model.Book;


@Service //so it starts it. Kinda like @component but specific for service
public class MyBooksService {

    List<Book> books =  Arrays.asList(
        new Book(1, "Frankenstein", "Mary Shelley", "978-123456-78", 12000, "Penguin Books"),
        new Book(2, "The King in Yellow", "Robert W. Chambers", "978-876543-21", 10000, "Wordsworth Classics"));

    public List<Book> getBooks(){
        return books;
    }
}
