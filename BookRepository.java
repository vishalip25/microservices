package com.bookmanagement.inventoryservice.Repository;

import com.bookmanagement.inventoryservice.Entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
    
}

