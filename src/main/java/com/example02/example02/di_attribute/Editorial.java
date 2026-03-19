package com.example02.example02.di_attribute;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Editorial {

    private Integer id;
    private String name;

    public Editorial(@Value("1") Integer id, @Value("Uptc") String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Editorial{id=" + id + ", name='" + name + '\'' + '}';
    }

    
}
