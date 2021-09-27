import java.util.ArrayList;

public class KanbanBoard {
    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(new Task(task, "WAITING"));
    }

    public void updateState(String task, String state) {
        for (Task element : tasks) {
            if (element.getTask().equals(task)) {
                element.updateTask(state);
            }
        }
    }

    public void nextState(String task) {
        for (Task element : tasks) {
            if (element.getTask().equals(task)) {
                if (element.getState().equals("WAITING")) {
                    element.updateTask("IN_PROGRESS");
                } else if (element.getState().equals("IN_PROGRESS")) {
                    element.updateTask("DONE");
                }
            }
        }
    }

    public void printTask() {
        ArrayList<String> waitingTasks = new ArrayList<>();
        ArrayList<String> inProgressTasks = new ArrayList<>();
        ArrayList<String> doneTasks = new ArrayList<>();
        ArrayList<String> needsDiscussionTasks = new ArrayList<>();
        for (Task element : tasks) {
            if (element.getState().equals("WAITING")) {
                waitingTasks.add("=> " + element.getTask());
            }
            else if (element.getState().equals("IN_PROGRESS")) {
                inProgressTasks.add("=> " + element.getTask());
            }
            else if (element.getState().equals("DONE")) {
                doneTasks.add("=> " + element.getTask());
            }
            else if (element.getState().equals("NEEDS_DISCUSSION")) {
                needsDiscussionTasks.add("=> " + element.getTask());
            }
        }

        System.out.println("\nWaiting: ");
        waitingTasks.forEach(System.out::println);
        System.out.println("In Progress: ");
        inProgressTasks.forEach(System.out::println);
        System.out.println("Needs discussion: ");
        needsDiscussionTasks.forEach(System.out::println);
        System.out.println("Done: ");
        doneTasks.forEach(System.out::println);
    }
}
