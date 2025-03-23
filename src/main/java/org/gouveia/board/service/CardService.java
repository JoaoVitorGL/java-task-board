package org.gouveia.board.service;

import lombok.AllArgsConstructor;
import org.gouveia.board.persistence.dao.CardDAO;
import org.gouveia.board.persistence.entity.CardEntity;

import java.sql.Connection;
import java.sql.SQLException;

@AllArgsConstructor
public class CardService {

    private final Connection connection;

    public CardEntity insert(final CardEntity entity) throws SQLException {
        try {
            var dao = new CardDAO(connection);
            dao.insert(entity);
            connection.commit();
            return entity;
        } catch (SQLException ex) {
            connection.rollback();
            throw ex;
        }
    }
}
