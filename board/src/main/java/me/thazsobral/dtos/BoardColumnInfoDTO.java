package me.thazsobral.dtos;

import me.thazsobral.persistence.entities.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}