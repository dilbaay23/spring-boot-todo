package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity

public class TodoItem {

    private Long id;

    @NotBlank
    private String title;
    private boolean done;


    protected TodoItem() {
    }

    public TodoItem(Long id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }

    public void setId(Long id) {

        this.id = id;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", done=" + done +
                '}';
    }
}
