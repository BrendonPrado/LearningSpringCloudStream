package br.com.message.consumer.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import br.com.message.consumer.domain.Sale;
import br.com.message.consumer.service.SaleService;

@EnableBinding(CustomProcessor.class)
public class SaleStreamListener {

    @Autowired
    private SaleService saleService;

    @StreamListener(target = CustomProcessor.INPUT)
    public void routeValues(Sale sale) {
        saleService.save(sale);
        System.out.println(sale.getSaleDetails());
    }
}