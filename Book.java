package com.bookmanagement.inventoryservice.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private int id;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private Date year;
    private boolean available;
    public Book(){
        
    }
    public Book(int id, String isbn, String title, String author, String publisher, Date year, boolean available) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.available = available;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public Date getYear() {
        return year;
    }
    public void setYear(Date year) {
        this.year = year;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    @Override
    public String toString() {
        return "Book [author=" + author + ", available=" + available + ", id=" + id + ", isbn=" + isbn
                + ", publisher=" + publisher + ", title=" + title + ", year=" + year + "]";
    }
    
}
