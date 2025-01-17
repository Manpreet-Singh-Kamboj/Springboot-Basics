package com.example.demo.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity(name = "Book")
@Table(name = "books")
public class Book {

    public Book(String title, String author, Double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Id
    @GenericGenerator(
            name = "uuid",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @GeneratedValue(
            generator = "uuid"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private UUID id;
    @Column(
            name = "title",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String title;
    @Column(
            name = "author",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String author;
    @Column(
            name = "price",
            nullable = false
    )
    private Double price;


    public UUID getId() {
        return id;
    }
    public void setId(UUID id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public Double getPrice(){
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }

}
