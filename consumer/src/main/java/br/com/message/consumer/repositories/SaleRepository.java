package br.com.message.consumer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.message.consumer.domain.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale,Long>{
    
}