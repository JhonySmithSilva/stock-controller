/*
 *     
    this project is created using as a basis another project carried
out in a bootcamp of the teaching platform Digital Innovation One.
    The use of all knowledge applied here is for public use, 
and has the main objective of being used as a portfolio in future opportunities,
and applying the knowledge acquired throughout the course.    

 */
package com.DigitalInnovatonOne.StockAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jony_
 */
@RestController
@RequestMapping("/api/v1/stock")
public class StockController {
    
    @GetMapping
    public String getBook(){
        return "testando a API! ";
    }
}
