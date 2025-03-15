package com.astrapay.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class NotesDto {
    private String title;

    @NotBlank(message = "Note must have a content")
    private String content;
}
