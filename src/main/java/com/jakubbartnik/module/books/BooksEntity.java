package com.jakubbartnik.module.books;

import javax.validation.constraints.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class BooksEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Author for book is required")
    private String author;

    @NotNull(message = "Title for book is required")
    private String title;

    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public BooksEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public BooksEntity setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BooksEntity setTitle(String title) {
        this.title = title;
        return this;
    }


}
