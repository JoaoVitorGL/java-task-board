package org.gouveia.board.ui;

import lombok.AllArgsConstructor;
import org.gouveia.board.persistence.entity.BoardEntity;
import org.gouveia.board.service.BoardQueryService;

import java.sql.SQLException;
import java.util.Scanner;

import static org.gouveia.board.persistence.config.ConnectionConfig.getConnection;

@AllArgsConstructor
public class BoardMenu {
    private final BoardEntity boardEntity;

    private final Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public void execute() {
        try {
            System.out.printf("Bem-vindo ao board %s, selecione a operação desejada:\n", boardEntity.getId());
            var option = -1;
            while (option != 9) {
                System.out.println("(1) - Criar um card");
                System.out.println("(2) - Mover um card");
                System.out.println("(3) - Bloquear um card");
                System.out.println("(4) - Desbloquear um card");
                System.out.println("(5) - Cancelar um card");
                System.out.println("(6) - Visualizar board");
                System.out.println("(7) - Visualizar colunas com cards");
                System.out.println("(8) - Visualizar card");
                System.out.println("(9) - Voltar um card para o menu anterior");
                System.out.println("(10) - Sair");
                option = scanner.nextInt();
                switch (option) {
                    case 1 -> createCard();
                    case 2 -> moveCardToNextColumn();
                    case 3 -> blockCard();
                    case 4 -> unblockCard();
                    case 5 -> cancelCard();
                    case 6 -> showBoard();
                    case 7 -> showColumn();
                    case 8 -> showCard();
                    case 9 -> System.out.println("Voltando para o menu anterior");
                    case 10 -> System.exit(0);
                    default -> System.out.println("Opção inválida, informe uma opção do menu.");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.exit(0);
        }
    }

    private void createCard() {
    }

    private void moveCardToNextColumn() {
    }

    private void blockCard() {
    }

    private void unblockCard() {
    }

    private void cancelCard() {
    }

    private void showBoard() throws SQLException {
        try (var connection = getConnection()) {
            var optional = new BoardQueryService(connection).showBoardDetails(boardEntity.getId());
            optional.ifPresent(b -> {
                System.out.printf("Board [%s, %s]\n", b.id(), b.name());
                b.columns().forEach(c -> {
                    System.out.printf("Coluna [%s] tipo: [%s] possui %s cards\n", c.name(), c.kind(), c.cardsAmount());
                });
            });
        }
    }

    private void showColumn() {
    }

    private void showCard() {

    }
}
