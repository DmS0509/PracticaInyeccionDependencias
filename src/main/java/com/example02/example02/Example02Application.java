package com.example02.example02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example02.example02.di_attribute.Book;

@SpringBootApplication
public class Example02Application {

	public static void main(String[] args) {
		//SpringApplication.run(Example02Application.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(Example02Application.class, args);
		Book book = context.getBean(Book.class);
		System.out.println(book);
	}

}
