package com.bobbbaich.fb.bot.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class FactProducerImpl {

    @KafkaListener(topics = "test")
    public void listen(String message) {
        System.out.println("Received Messasge in group foo: " + message);
    }
}
