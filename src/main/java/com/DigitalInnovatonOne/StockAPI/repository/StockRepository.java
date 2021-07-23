/*
 *     
    this project is created using as a basis another project carried
out in a bootcamp of the teaching platform Digital Innovation One.
    The use of all knowledge applied here is for public use, 
and has the main objective of being used as a portfolio in future opportunities,
and applying the knowledge acquired throughout the course.    

 */
package com.DigitalInnovatonOne.StockAPI.repository;

import com.DigitalInnovatonOne.StockAPI.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jony_
 */
public interface StockRepository extends JpaRepository<Product, Long> {
    
}
