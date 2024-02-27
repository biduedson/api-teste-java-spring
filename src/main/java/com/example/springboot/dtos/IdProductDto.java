package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public record IdProductDto(@NotBlank(message = "Id não pode esta vazio.") UUID id) {
}
