package com.bookmanagement.lendingservice.Repository;

import com.bookmanagement.lendingservice.Entity.Lend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LendRepository extends JpaRepository<Lend,Integer> {
    
}
