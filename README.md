<h1 align="center">
  Task Board
</h1>

O projeto implementa um board de tarefas utilizando java. Criado para o desafio de projeto do bootcamp decola tech Avanade 2025 (Criando seu Board de Tarefas com Java).

## Tecnologias

- Java 21
- JDBC
- Docker
- MySQL
- Liquibase

## Funcionalidades

### 🎯 Gerenciamento de Boards
- **Criação de boards** com colunas personalizadas (inicial, pendente, final e cancelamento)
- **Visualização e seleção** de boards existentes
- **Exclusão** de boards

### 📋 Gerenciamento de Colunas
- Definição de tipos de colunas (INITIAL, PENDING, FINAL, CANCEL)
- Ordenação customizada de colunas
- Visualização de colunas com seus respectivos cards

### 🃏 Gerenciamento de Cards
- **Criação de cards** com título e descrição
- **Movimentação** entre colunas (fluxo de trabalho)
- **Bloqueio/desbloqueio** de cards com registro de motivo
- **Cancelamento** de cards (movimento para coluna de cancelamento)
- Visualização detalhada de cards (status, histórico de bloqueios, coluna atual)

### 👀 Visualizações
- Dashboard do board (visão geral com quantidade de cards por coluna)
- Detalhes de colunas específicas com seus cards
- Visualização individual de cards com todas informações


