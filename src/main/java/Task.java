package main.java;

public class Task {
    private String task;
    private String state;

    Task(String task, String state) {
        this.task = task;
        this.state = state;
    }

    public String getTask() {
        return task;
    }

    public String getState() {
        return state;
    }

    public void updateTask(String state) {
        this.state = state;
    }
}
