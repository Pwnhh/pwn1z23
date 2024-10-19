package com.example.todo.model;
import com.example.todo.controller.TodoController;

import java.time.LocalDate;
public class Todo {
    private Long id;
    private String description;
    private boolean isCompleted;
    private String priority; // 新增：任务优先级

    // 构造函数、getter和setter省略
    public Todo(Long id, String s, String description, TodoController.LocalDate dueDate) {
        this.id = id;
        this.description = description;
        this.isCompleted = false;
        this.priority = priority;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
=======
    private LocalDate dueDate; // 新增：任务截止日期

    // 构造函数、getter和setter省略
    public Todo(Long id, String description,LocalDate dueDate) {
        this.id = id;
        this.description = description;
        this.isCompleted = false;
        this.dueDate = dueDate;
    }

    public Todo(long id, String description, TodoController.LocalDate priority) {
    }

    public Todo(long l, String description, String description1, TodoController.LocalDate dueDate) {
>>>>>>> feature/due-date
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

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

