package com.devsuperior.clientchallenge.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_client")
public record Client(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        String name,
        String cpf,
        Double income,
        LocalDate birthDate,
        Integer children) {
}
