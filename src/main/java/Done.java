import java.util.ArrayList;

public class Done {
    private ArrayList<String> DoneTasks = new ArrayList();

    public ArrayList<String> getTask() {
        return DoneTasks;
    }

    public void printDoneTasks() {
        System.out.println("Done: ");
        for (String element : DoneTasks) {
            System.out.println("=> " + element);
        }
    }

    public void addTask(String element) {
        DoneTasks.add(element);
    }

    public void removetask(String element) {
        DoneTasks.remove(element);
    }
}
