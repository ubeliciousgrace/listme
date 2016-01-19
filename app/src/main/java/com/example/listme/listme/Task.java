package com.example.listme.listme;

/**
 * Created by grace.kim on 1/19/16.
 */
public class Task {
    private String taskName;
    private int status;
    private int id;

    public Task() {
        this.taskName = null;
        this.status = 0;
    }

    public Task(String taskName, int status) {
        super();
        this.taskName = taskName;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName() {
        this.taskName = taskName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}