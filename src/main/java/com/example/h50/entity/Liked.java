package com.example.h50.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Liked {
    private Publication publication;
    private User markedUser;
    LocalDateTime markedDateTime;

}
