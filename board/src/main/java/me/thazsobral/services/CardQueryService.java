package me.thazsobral.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

import lombok.AllArgsConstructor;
import me.thazsobral.dtos.CardDetailsDTO;
import me.thazsobral.persistence.dao.CardDAO;

@AllArgsConstructor
public class CardQueryService {

    private final Connection connection;

    public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {
        var dao = new CardDAO(connection);
        return dao.findById(id);
    }

}
