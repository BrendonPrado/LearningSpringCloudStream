package br.com.message.sender.resource;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.message.sender.Service.SaleSenderService;
import br.com.message.sender.domain.Sale;

@RestController
@RequestMapping("/sales")
public class SaleResouce {

    @Autowired
    private SaleSenderService saleSender;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Sale sale) throws URISyntaxException {
        
        saleSender.sendToApis(sale);
        return ResponseEntity.created(new URI("/sales")).build();
    }
    
    
}