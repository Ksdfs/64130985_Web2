package com.thiGK.ntu64130985.models;

import jakarta.persistence.*;
@Entity
@Table(name = "pages")
public class Page {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pageName;
    private String keyword;
    private String content;
    private Long parentPageId;

    // Getter và Setter
}
