package org.gouveia.board;

import org.gouveia.board.persistence.migration.MigrationStrategy;
import org.gouveia.board.ui.MainMenu;

import java.sql.SQLException;

import static org.gouveia.board.persistence.config.ConnectionConfig.getConnection;

public class Main {
    public static void main(String[] args) throws SQLException {
        try (var connection = getConnection()) {
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }
}
