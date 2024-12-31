package com.devsuperior.clientchallenge.dto;

import com.devsuperior.clientchallenge.entities.Client;

import java.time.LocalDate;

public record ClientDTO(
        Long id,
        String name,
        String cpf,
        Double income,
        LocalDate birthDate,
        Integer children) {

    public ClientDTO(Client client) {
        this(
                client.getId(),
                client.getName(),
                client.getCpf(),
                client.getIncome(),
                client.getBirthDate(),
                client.getChildren()
        );
    }
}
