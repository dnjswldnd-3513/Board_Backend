package com.wjw.Board.dto;

import java.time.LocalDateTime;

public record PostResponseDto(Long id,
                              String title,
                              String content,
                              LocalDateTime createdAt) {
}
