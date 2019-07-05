package br.com.message.sender;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CustomProcessor {

    String OUTPUT = "batata";

    @Output(OUTPUT)
    MessageChannel create();
}