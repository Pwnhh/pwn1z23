package com.example.todo.model;
public class Todo {
    private Long id;
    private String description;
    private boolean isCompleted;
    private String priority; // 新增：任务优先级

    // 构造函数、getter和setter省略
    public Todo(Long id, String s, String description) {
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
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}