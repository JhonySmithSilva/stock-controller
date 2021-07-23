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

package com.DigitalInnovatonOne.StockAPI.dto.request;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    
    private Long id;

    //@NotEmpty
    //@Size(min = 2, max = 100)
    private String nameProduct;

    
}
    

