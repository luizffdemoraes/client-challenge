package com.devsuperior.clientchallenge.repositories;

import com.devsuperior.clientchallenge.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
