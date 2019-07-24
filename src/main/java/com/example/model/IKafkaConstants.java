package com.example.model;

public interface IKafkaConstants {
    String KAFKA_BROKERS = "localhost:9092";
    String CLIENT_ID = "client1";
    Integer MESSAGE_COUNT = 2;
    String TOPIC_NAME = "product";
    String GROUP_ID_CONFIG = "consumerGroup1";
    Integer MAX_NO_MESSAGE_FOUND_COUNT = 100;
    String OFFSET_RESET_LATEST = "latest";
    String OFFSET_RESET_EARLIER = "earliest";
    Integer MAX_POLL_RECORDS = 1;
}
