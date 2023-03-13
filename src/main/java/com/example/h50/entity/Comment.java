package com.example.h50.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Comment {
    private User user;
    private Publication publication;
    private String commentText;
    private LocalDateTime commentDateTime;


}
