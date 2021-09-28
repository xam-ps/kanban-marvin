import java.util.ArrayList;

public class KanbanBoard {
    ArrayList<Task> tasks = new ArrayList<>();
    private enum State { waiting, inProgress, needsdiscussion, done; }

    public void addTask(String task) {
        tasks.add(new Task(task, "waiting"));
    }

    public void updateState(String task, String state) {
        for (Task element : tasks) {
            if (element.getTask().equals(task)) {
                State checkedState =State.valueOf(state);
                element.updateTask(String.valueOf(checkedState));
            }
        }
    }

    public void nextState(String task) {
        for (Task element : tasks) {
            if (element.getTask().equals(task)) {
                if (element.getState().equals("waiting")) {
                    element.updateTask("inProgress");
                } else if (element.getState().equals("inProgress")) {
                    element.updateTask("done");
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
            if (element.getState().equals("waiting")) {
                waitingTasks.add("=> " + element.getTask());
            }
            else if (element.getState().equals("inProgress")) {
                inProgressTasks.add("=> " + element.getTask());
            }
            else if (element.getState().equals("done")) {
                doneTasks.add("=> " + element.getTask());
            }
            else if (element.getState().equals("needsdiscussion")) {
                needsDiscussionTasks.add("=> " + element.getTask());
            }
        }

        System.out.println("\nwaiting: ");
        waitingTasks.forEach(System.out::println);
        System.out.println("In Progress: ");
        inProgressTasks.forEach(System.out::println);
        System.out.println("Needs discussion: ");
        needsDiscussionTasks.forEach(System.out::println);
        System.out.println("Done: ");
        doneTasks.forEach(System.out::println);
    }
}
