package com.ddeogip.todo.web.todo.dto;

import com.ddeogip.todo.domain.entity.Todo;

import java.time.LocalDateTime;

public class TodoResponseDto {

    private Long id;

    private String title;

    private String content;

    private LocalDateTime limitDate;

    private Boolean complete;

    private LocalDateTime completeDate;

    public TodoResponseDto(Todo todo) {
    }

}
