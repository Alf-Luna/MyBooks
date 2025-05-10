package com.alfo.MyBooks.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alfo.MyBooks.Model.Book;

//In this script I look for books in three different ways, I did it for the sake of practicing different methos. 
//Would have been more efficient to have a method that returns the book index by id.
@Service //so it starts it. Kinda like @component but specific for service
public class MyBooksService {

    List<Book> books =  new ArrayList<>(Arrays.asList(
        new Book(1, "Frankenstein", "Mary Shelley", "1818", "978-123456-78", 12000, "Penguin Books"),
        new Book(2, "The King in Yellow", "Robert W. Chambers", "1895", "978-876543-21", 10000, "Wordsworth Classics")));

    public List<Book> getBooks(){
        return books;
    }

    public Book getBookById(int id){
        return books.stream() //Kinda like a for loop. Should study it more prolly
            .filter(b -> b.getId() == id) //Filters looking for the id
            .findFirst().get(); //Gets the first match
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void updateBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == book.getId()){
                books.set(i, book);
                break;
            }
          }
    }

    public void deleteBookById(int id) {
        for (Book book:books){
            if (book.getId() == id){
                books.remove(book);
                break;
            }
        }
    }
}
