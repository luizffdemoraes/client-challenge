package com.devsuperior.clientchallenge.dto;

import com.devsuperior.clientchallenge.entities.Client;

import java.time.LocalDate;

public record ClientDTO(
        String name,
        String cpf,
        Double income,
        LocalDate birthDate,
        Integer children) {

    public ClientDTO(Client client) {
        this(
                client.name(),
                client.cpf(),
                client.income(),
                client.birthDate(),
                client.children()
        );
    }
}
