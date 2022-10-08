package com.analog.springdemo1;

public class Greet {
    private Long id;
    private String content;

    public Greet() {
    }

    public Greet(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public Greet withId(Long id) {
        this.id = id;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Greet withContent(String content) {
        this.content = content;
        return this;
    }
}
