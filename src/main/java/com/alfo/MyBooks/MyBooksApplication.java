package com.alfo.MyBooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) //exclude is needed since I added mysql dependencies but haven't started a DB
public class MyBooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBooksApplication.class, args);
	}

}
