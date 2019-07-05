package br.com.message.consumer.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface CustomProcessor {

    String INPUT = "batata";
 
    @Input(INPUT)
    SubscribableChannel myInput();
}