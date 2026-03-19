package com.example02.example02.di_attribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    private Integer id;
    private String title;
    private Editorial editorial;

    public Book() {
    }

    public Integer getId() {
        return id;
    }

    @Value("1")
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    @Value("Metamodelos")
    public void setTitle(String title) {
        this.title = title;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    @Autowired
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Book[id=" + id + ", title='" + title + '\'' + ", editorial=" + editorial + ']';
    }
}
