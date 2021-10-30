package com.springframework.spring5Webap.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String isBn;
    private String publisher;

    @ManyToMany
    private Set<Author> authorSet=new HashSet<>();

    public Book(){

    }

    public Book(String title,String isBn,String publisher){
        this.title=title;
        this.isBn=isBn;
        this.publisher=publisher;
    }
    public Book(String title,String isBn,String publisher,Set<Author> authorSet){
        this.title=title;
        this.isBn=isBn;
        this.publisher=publisher;
        this.authorSet=authorSet;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsBn() {
        return isBn;
    }

    public void setIsBn(String isBn) {
        this.isBn = isBn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Set<Author> getAuthorSet() {
        return authorSet;
    }

    public void setAuthorSet(Set<Author> authorSet) {
        this.authorSet = authorSet;
    }
}
