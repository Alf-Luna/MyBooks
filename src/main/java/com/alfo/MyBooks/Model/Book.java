package com.alfo.MyBooks.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //From lombok, make getters and setters automatically.
@AllArgsConstructor //Also from lombok. Makes a constructor with all arguments
@NoArgsConstructor //Same but empty
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String author;
    private String date; //SHOULD BE OTHER FORMAT. DATE FORMAT BUT I DON'T GRASP THAT FULLY YET
    private String isbn;
    private long price;
    private String publishingHouse;
}
