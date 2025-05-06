package com.alfo.MyBooks.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alfo.MyBooks.Model.Book;
import com.alfo.MyBooks.Service.MyBooksService;

@RestController
public class BooksController {

    @Autowired //Initiates it I believe, also connects it.
    MyBooksService myBooksService;

    @RequestMapping("/home")
    public String greet(){
        return "Welcome to the homepage";
    }

    @RequestMapping("/books")
    public List<Book> getBooks(){
        return myBooksService.getBooks();
    }
}
