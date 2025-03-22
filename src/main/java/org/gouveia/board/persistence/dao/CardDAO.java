package org.gouveia.board.persistence.dao;

import lombok.AllArgsConstructor;
import org.gouveia.board.dto.CardDetails;

import java.sql.Connection;

@AllArgsConstructor
public class CardDAO {

    public final Connection connection;

    public CardDetails findById(final Long id) {
        return null;
    }
}
