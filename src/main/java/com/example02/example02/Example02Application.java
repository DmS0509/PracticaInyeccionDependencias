package com.example02.example02;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example02.example02.di_attribute.Book;
import com.example02.example02.di_attribute.Editorial;

@SpringBootApplication
public class Example02Application {

	public static void main(String[] args) {
		//SpringApplication.run(Example02Application.class, args);

		Editorial editorial = new Editorial(1, "Editorial Uptc");
		Book book = new Book(1, "Metamodelos", editorial);

		System.out.println(book.toString());
	}

}
