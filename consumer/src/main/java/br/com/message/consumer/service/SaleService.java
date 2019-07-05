package br.com.message.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.message.consumer.domain.Sale;
import br.com.message.consumer.repositories.SaleRepository;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repo;

    public void save(Sale sale){
        repo.save(sale);
    } 
    
}