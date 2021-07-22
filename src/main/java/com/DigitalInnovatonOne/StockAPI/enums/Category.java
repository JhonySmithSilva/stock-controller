/*
 *     
    this project is created using as a basis another project carried
out in a bootcamp of the teaching platform Digital Innovation One.
    The use of all knowledge applied here is for public use, 
and has the main objective of being used as a portfolio in future opportunities,
and applying the knowledge acquired throughout the course.    

 */
package com.DigitalInnovatonOne.StockAPI.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author jony_
 */
@Getter
@AllArgsConstructor
public enum Category {      
    
    CLOTHERS("clothrers"),
    SHOES("shoes"),
    ELETRONICS("eletronic");
    
    private final String description; 
    
}
