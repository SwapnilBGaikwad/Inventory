package com.example.controller;

import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/")
    @ResponseBody
    public Product addProduct(@RequestParam String name, Double price) throws Exception {
        Product product = new Product(name, price);
        service.add(product);
        return product;
    }

    @GetMapping("/count")
    @ResponseBody
    public Integer getCount() {
        return service.size();
    }
}