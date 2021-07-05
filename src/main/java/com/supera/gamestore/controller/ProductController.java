package com.supera.gamestore.controller;


import com.supera.gamestore.product.ProductRequestDTO;
import com.supera.gamestore.product.ProductResponseDTO;
import com.supera.gamestore.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController implements ProductControllerDocs{

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponseDTO create(
            @RequestBody ProductRequestDTO productRequestDTO){
        return productService.create(productRequestDTO);
    }

    @GetMapping
    public List<ProductResponseDTO> findAllByPrice(){
        return productService.findAllByOrderByPriceDesc();
    }

}
