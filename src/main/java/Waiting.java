import java.util.ArrayList;

public class Waiting {
    private ArrayList<String> WaitingTasks = new ArrayList();

    public ArrayList<String> getTask(){
        return WaitingTasks;
    }
    public void printWaitingTasks(){
        System.out.println("Waiting: ");
        for (String element:WaitingTasks){
            System.out.println("=> "+element);
        }
    }
    public void addTask(String element){
        WaitingTasks.add(element);
    }

    public void removetask(String element) {
        WaitingTasks.remove(element);
    }
}
