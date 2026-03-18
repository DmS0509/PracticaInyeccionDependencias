package com.example02.example02.di_attribute;

public class Book {

    private Integer id;
    private String title;
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
