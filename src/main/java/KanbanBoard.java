import java.util.ArrayList;

public class KanbanBoard {
    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(new Task(task, "waiting"));

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
                if (element.getState().equals("waiting")) {
                    element.updateTask("inprogress");
                } else if (element.getState().equals("inprogress")) {
                    element.updateTask("done");
                }
            }


        }
    }

    public void printTask() {
        ArrayList<String> waiting = new ArrayList<>();
        ArrayList<String> inprogress = new ArrayList<>();
        ArrayList<String> done = new ArrayList<>();
        ArrayList<String> needsdiscussion = new ArrayList<>();
        for (Task element : tasks) {
            if (element.getState().equals("waiting")) {
                waiting.add("=> " + element.getTask());
            }
            else if (element.getState().equals("inprogress")) {
                inprogress.add("=> " + element.getTask());
            }
            else if (element.getState().equals("done")) {
                done.add("=> " + element.getTask());
            }
            else if (element.getState().equals("needsdiscussion")) {
                needsdiscussion.add("=> " + element.getTask());
            }
        }

        System.out.println("\nWaiting: ");
        waiting.forEach(System.out::println);
        System.out.println("In Progress: ");
        inprogress.forEach(System.out::println);
        System.out.println("Needs discussion: ");
        needsdiscussion.forEach(System.out::println);
        System.out.println("Done: ");
        done.forEach(System.out::println);
    }
}
