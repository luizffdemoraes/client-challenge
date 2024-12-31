package com.devsuperior.clientchallenge.dto;

import com.devsuperior.clientchallenge.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public record ClientDTO(
        Long id,
        @NotBlank(message = "Required field")
        String name,
        String cpf,
        Double income,
        @PastOrPresent(message = "Must be a date in the past or present")
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
