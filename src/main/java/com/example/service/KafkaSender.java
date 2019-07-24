package com.example.service;

import com.example.model.IKafkaConstants;
import com.example.model.Product;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class KafkaSender {
    @Autowired
    private Producer<Long, Product> producer;

    void send(Product product) throws Exception {
        long key = product.getName().length();
        ProducerRecord<Long, Product> record = new ProducerRecord<>(IKafkaConstants.TOPIC_NAME, key, product);
        RecordMetadata metadata = producer.send(record).get();
        System.out.println("metadata : " + metadata);
    }
}
