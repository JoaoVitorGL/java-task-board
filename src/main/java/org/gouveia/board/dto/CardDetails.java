package org.gouveia.board.dto;

import java.time.OffsetDateTime;

public record CardDetails(Long id,
                          boolean blocked,
                          OffsetDateTime blockedAt,
                          String blockReson,
                          int blocksAmount,
                          Long columnId,
                          String columnName
) {
}
