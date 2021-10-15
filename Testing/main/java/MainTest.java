package main.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testAddTask() {
        KanbanBoard serviceundertest = new KanbanBoard();
        serviceundertest.addTask("Blub");

        ArrayList<Task> test = serviceundertest.getTasks();
        String ausgabe = test.get(0).getTask();

        assertEquals("Blub", ausgabe);
    }

    @Test
    public void testUpdateState() {
        KanbanBoard serviceundertest = new KanbanBoard();
        serviceundertest.addTask("Blub");
        serviceundertest.updateState("Blub", "done");

        ArrayList<Task> test = serviceundertest.getTasks();
        String ausgabe = test.get(0).getState();

        assertEquals("done", ausgabe);
    }

    @Test
    public void testUpdateStateEnum() {
        KanbanBoard servicundertest = new KanbanBoard();
        servicundertest.addTask("Blub");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            servicundertest.updateState("Blub", "Done");
        });
    }

    @Test
    public void testNextStateInProgress() {
        KanbanBoard serviceundertest = new KanbanBoard();
        serviceundertest.addTask("Blub");
        serviceundertest.nextState("Blub");

        ArrayList<Task> test = serviceundertest.getTasks();
        String ausgabe = test.get(0).getState();

        assertEquals("inProgress", ausgabe);
    }

    @Test
    public void testNextStateDone() {
        KanbanBoard serviceundertest = new KanbanBoard();
        serviceundertest.addTask("Blub");
        serviceundertest.nextState("Blub");
        serviceundertest.nextState("Blub");

        ArrayList<Task> test = serviceundertest.getTasks();
        String ausgabe = test.get(0).getState();

        assertEquals("done", ausgabe);
    }


}