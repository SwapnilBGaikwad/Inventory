package com.example.service;

import com.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new LinkedList<>();
    private KafkaSender kafkaSender;

    @Autowired
    public ProductService(KafkaSender kafkaSender) {
        this.kafkaSender = kafkaSender;
    }

    public void add(Product product) throws Exception {
        products.add(product);
        kafkaSender.send(product);
    }


    public Integer size() {
        return products.size();
    }
}
