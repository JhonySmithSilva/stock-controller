/*
 *     
    this project is created using as a basis another project carried
out in a bootcamp of the teaching platform Digital Innovation One.
    The use of all knowledge applied here is for public use, 
and has the main objective of being used as a portfolio in future opportunities,
and applying the knowledge acquired throughout the course.    

 */
package com.DigitalInnovatonOne.StockAPI.dto.mapper;

import com.DigitalInnovatonOne.StockAPI.dto.request.ProductDTO;
import com.DigitalInnovatonOne.StockAPI.entity.Product;
import org.springframework.web.bind.annotation.Mapping;

/**
 *
 * @author jony_
 */
//@Mapper(componentModel = "spring")
public interface ProductMapper {
    
    


    //@Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Product toModel(ProductDTO dto);

    ProductDTO toDTO(Product dto);
}
    

