package com.bookmanagement.lendingservice.Controller;

import java.util.List;

import com.bookmanagement.lendingservice.Entity.Lend;
import com.bookmanagement.lendingservice.Service.LendService;

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
@RequestMapping("/lend")
public class LendController {
    @Autowired
    LendService service;

    @PostMapping("/saveLend")
    public Lend addProduct(@RequestBody Lend lend) {
        return service.saveLend(lend);
    }
    @PutMapping("/editLend/{id}")
    public Lend updateProduct(@RequestBody Lend lend) {
        return service.updateLend(lend);
    }
    @DeleteMapping("/deleteLend/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteLend(id);
    }
    @GetMapping("/getLends")
    public List<Lend> findAllProducts() {
        return service.getLends();
    }

    @GetMapping("/getLend/{id}")
    public Lend findProductById(@PathVariable int id) {
        return service.getLendById(id);
    }  

}
