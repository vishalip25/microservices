package com.bookmanagement.inventoryservice.Controller;

import java.util.List;

import com.bookmanagement.inventoryservice.Entity.Book;
import com.bookmanagement.inventoryservice.Service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class BookController {
    @Autowired
    BookService service;

    @PostMapping("/saveBook")
    public Book addProduct(@RequestBody Book book) {
        return service.saveBook(book);
    }
    @PutMapping("/editBook/{id}")
    public Book updateProduct(@RequestBody Book book) {
        return service.updateBook(book);
    }
    @DeleteMapping("/deleteBook/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteBook(id);
    }
    @GetMapping("/getBooks")
    public List<Book> findAllProducts() {
        return service.getBooks();
    }

    @GetMapping("/getBook/{id}")
    public Book findProductById(@PathVariable int id) {
        return service.getBookById(id);
    }
}
