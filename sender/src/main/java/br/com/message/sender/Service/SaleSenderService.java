package br.com.message.sender.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import br.com.message.sender.CustomProcessor;
import br.com.message.sender.domain.Sale;

@EnableBinding(CustomProcessor.class)
@Service
public class SaleSenderService {

    @Autowired
    private CustomProcessor sender;

    public void sendToApis(Sale sale){
        sender.create().send(MessageBuilder.withPayload(sale).build());
    }
}