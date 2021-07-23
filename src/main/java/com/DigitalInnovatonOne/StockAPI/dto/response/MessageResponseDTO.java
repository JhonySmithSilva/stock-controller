package com.DigitalInnovatonOne.StockAPI.dto.response;

import lombok.Builder;
import lombok.Data;

/*
 *     
    this project is created using as a basis another project carried
out in a bootcamp of the teaching platform Digital Innovation One.
    The use of all knowledge applied here is for public use, 
and has the main objective of being used as a portfolio in future opportunities,
and applying the knowledge acquired throughout the course.    

 */

/**
 *
 * @author jony_
 */
@Data
@Builder
public class MessageResponseDTO {
    
    private String message;
    
}
