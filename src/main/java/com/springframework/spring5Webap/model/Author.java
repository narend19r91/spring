package com.springframework.spring5Webap.model;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private String firstName;
    private String lastName;

    @ManyToMany
    private Set<Book> books=new HashSet<>();

    private Author(){

    }
    private Author(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
