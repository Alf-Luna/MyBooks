package com.alfo.MyBooks.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alfo.MyBooks.Model.Book;
import com.alfo.MyBooks.Service.MyBooksService;

@RestController
public class BooksController {

    @Autowired //Initiates it I believe, also connects it.
    MyBooksService myBooksService;

    @GetMapping("/home")
    public String greet(){
        return "Welcome to the homepage";
    }

    @GetMapping("/books")
    public List<Book> getBooks(){
        return myBooksService.getBooks();
    }


    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id){ //@pathvariable is used to get the id from the url, denoted by {}
        return myBooksService.getBookById(id);
    }

    @PostMapping("/books")
    public void addBook(@RequestBody Book book){ //@Requestbody is used to convert the data you receive into an object
        myBooksService.addBook(book);
    }

    @PutMapping("/books")
    public void updateBook(@RequestBody Book book){
        myBooksService.updateBook(book);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBookById(@PathVariable int id){
        myBooksService.deleteBookById(id);
    }
}
