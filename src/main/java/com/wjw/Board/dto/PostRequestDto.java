package com.wjw.Board.dto;

import java.time.LocalDateTime;

public record PostRequestDto(

        Long id,
        String title,
        String content,
        LocalDateTime createdAt
) {

    public PostRequestDto create(){
        return null;
    }
}
