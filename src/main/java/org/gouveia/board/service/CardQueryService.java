package org.gouveia.board.service;

import lombok.AllArgsConstructor;
import org.gouveia.board.dto.CardDetailsDTO;
import org.gouveia.board.persistence.dao.CardDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class CardQueryService {

    public final Connection connection;

    public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {
        var dao = new CardDAO(connection);
        return dao.findById(id);
    }
}
