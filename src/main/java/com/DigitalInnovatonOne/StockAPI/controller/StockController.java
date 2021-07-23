/*
 *     
    this project is created using as a basis another project carried
out in a bootcamp of the teaching platform Digital Innovation One.
    The use of all knowledge applied here is for public use, 
and has the main objective of being used as a portfolio in future opportunities,
and applying the knowledge acquired throughout the course.    

 */
package com.DigitalInnovatonOne.StockAPI.controller;

import com.DigitalInnovatonOne.StockAPI.dto.response.MessageResponseDTO;
import com.DigitalInnovatonOne.StockAPI.entity.Product;
import com.DigitalInnovatonOne.StockAPI.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jony_
 */
@RestController
@RequestMapping("api/v1/stock")
public class StockController {
    
    private StockRepository stockRepository;

    @Autowired
    public StockController(StockRepository personRepository) {
        this.stockRepository = stockRepository;
    }    
    
    @PostMapping
    public MessageResponseDTO createProduct(@RequestBody Product product){
        Product savedProduct = stockRepository.save(product);
        return MessageResponseDTO
                .builder()
                .message("created product ID " + savedProduct.getId())
                .build();
    }
}
