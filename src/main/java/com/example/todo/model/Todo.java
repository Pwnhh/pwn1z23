package com.example.todo.model;
import com.example.todo.controller.TodoController;

import java.time.LocalDate;
public class Todo {
    private Long id;
    private String description;
    private boolean isCompleted;
    private LocalDate dueDate; // 新增：任务截止日期

    // 构造函数、getter和setter省略
    public Todo(Long id, String description,LocalDate dueDate) {
        this.id = id;
        this.description = description;
        this.isCompleted = false;
        this.dueDate = dueDate;
    }

    public Todo(long id, String description, String priority) {
    }

    public Todo(long l, String description, String description1, TodoController.LocalDate dueDate) {
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
    // 省略getter和setter
    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setCompleted(boolean b) {
    }
}

