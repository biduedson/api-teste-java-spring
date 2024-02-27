package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

public record ProductRecordDto( @NotBlank(message = "O campo 'name' não pode estar em branco.") String name, @NotNull(message = "O campo value não pode esta vazio.") BigDecimal value ) {



}
