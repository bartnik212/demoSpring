package com.jakubbartnik.module.blog;

public class PostForm {

    private String title;
    private String text;

    public PostForm setTitle(String title) {
        this.title = title;
        return this;
    }

    public PostForm setText(String text) {
        this.text = text;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
