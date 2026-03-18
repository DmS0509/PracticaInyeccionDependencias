package com.example02.example02.di_attribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("1")
    private Integer id;
    @Value("Metamodelos")
    private String title;
    @Autowired
    private Editorial editorial;

    public Book() {

    }

    public Book(Integer id, String title, Editorial editorial) {
        this.id = id;
        this.title = title;
        this.editorial = editorial;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Book[id=" + id + ", title='" + title + '\'' + ", editorial=" + editorial + ']';
    }
}
