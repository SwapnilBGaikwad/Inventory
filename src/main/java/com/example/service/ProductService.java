package com.example.service;

import com.example.model.Product;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new LinkedList<>();

    public void add(Product product) {
        products.add(product);
    }


    public Integer size() {
        return products.size();
    }
}
