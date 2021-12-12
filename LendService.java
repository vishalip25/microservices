package com.bookmanagement.lendingservice.Service;

import java.util.List;

import com.bookmanagement.lendingservice.Entity.Lend;
import com.bookmanagement.lendingservice.Repository.LendRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LendService {
@Autowired  
LendRepository repository; 


public Lend saveLend(Lend lend) {
    return repository.save(lend);
}


public List<Lend> getLends() {
    return repository.findAll();
}

public Lend getLendById(int id) {
    return repository.findById(id).orElse(null);
}


public String deleteLend(int id) {
    repository.deleteById(id);
    return "lend removed !! " + id;
}

public Lend updateLend(Lend lend) {
    Lend existingProduct = repository.findById(lend.getId()).orElse(null);
    existingProduct.setFirstName(lend.getFirstName());
    existingProduct.setLastName(lend.getLastName());
    existingProduct.setLendDate(lend.getLendDate());
    existingProduct.setFees(lend.getFees());
    return repository.save(existingProduct);
}
}