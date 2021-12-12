package com.bookmanagement.inventoryservice.Service;

import java.util.List;

import com.bookmanagement.inventoryservice.Entity.Book;
import com.bookmanagement.inventoryservice.Repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
@Autowired  
BookRepository repository;  


public Book saveBook(Book book) {
    return repository.save(book);
}


public List<Book> getBook() {
    return repository.findAll();
}

public Book getBookById(int id) {
    return repository.findById(id).orElse(null);
}



public String deleteBook(int id) {
    repository.deleteById(id);
    return "book removed !! " + id;
}

public Book updateBook(Book book) {
    Book existingProduct = repository.findById(book.getId()).orElse(null);
    existingProduct.setIsbn(book.getIsbn());
    existingProduct.setTitle(book.getTitle());
    existingProduct.setAuthor(book.getAuthor());
    existingProduct.setPublisher(book.getPublisher());
    existingProduct.setYear(book.getYear());
    existingProduct.setAvailable(book.isAvailable());
    return repository.save(existingProduct);
}


public List<Book> getBooks() {
    return null;
}
}
