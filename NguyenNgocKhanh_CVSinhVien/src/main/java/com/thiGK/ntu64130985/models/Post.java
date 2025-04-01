package com.thiGK.ntu64130985.models;

import jakarta.persistence.*;
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private Long categoryId;

    // Getter và Setter
}
