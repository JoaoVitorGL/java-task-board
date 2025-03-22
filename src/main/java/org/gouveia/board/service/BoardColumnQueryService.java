package org.gouveia.board.service;

import lombok.AllArgsConstructor;
import org.gouveia.board.persistence.dao.BoardColumnDAO;
import org.gouveia.board.persistence.entity.BoardColumnEntity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class BoardColumnQueryService
{
    private final Connection connection;

    public Optional<BoardColumnEntity> findById(final Long id) throws SQLException {
        var dao = new BoardColumnDAO(connection);
        return dao.findById(id);
    }
}
