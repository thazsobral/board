package me.thazsobral.dtos;

import me.thazsobral.persistence.entities.BoardColumnKindEnum;

public record BoardColumnDTO(Long id,
                             String name,
                             BoardColumnKindEnum kind,
                             int cardsAmount) {
}