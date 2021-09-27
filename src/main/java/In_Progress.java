import java.util.ArrayList;

public class In_Progress {
    private ArrayList<String> TasksInProgress = new ArrayList();

    public ArrayList<String> getTask() {
        return TasksInProgress;
    }

    public void printTasksInProgress() {
        System.out.println("In Progress: ");
        for (String element : TasksInProgress) {
            System.out.println("=> " + element);
        }
    }

    public void addTask(String element) {
        TasksInProgress.add(element);
    }

    public void removetask(String element) {
        TasksInProgress.remove(element);
    }
}
