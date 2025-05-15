package com.alfo.MyBooks.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfo.MyBooks.Model.Book;
import com.alfo.MyBooks.Repository.BooksRepository;

//In this script I look for books in three different ways, I did it for the sake of practicing different methos. 
//Would have been more efficient to have a method that returns the book index by id.
@Service //so it starts it. Kinda like @component but specific for service
public class MyBooksService {

    @Autowired
    BooksRepository booksRepo;

    public List<Book> getBooks(){
        return booksRepo.findAll();
    }

    public Book getBookById(int id){
        return booksRepo.findById(id).orElse(new Book());
    }

    public void addBook(Book book) {
        booksRepo.save(book);
    }

    public void updateBook(Book book) {
        booksRepo.save(book);
    }

    public void deleteBookById(int id) {
        booksRepo.deleteById(id);
    }
}
