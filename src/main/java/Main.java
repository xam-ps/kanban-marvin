import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Waiting waiting = new Waiting();
        In_Progress inProgress = new In_Progress();
        Done done = new Done();
        Scanner sc = new Scanner(System.in);
        String input;
        String repeat = "true";
        String fromwhere;
        String towhere;
        String task;

        while (repeat.equals("true")) {
            System.out.print("Add a Task: ");
            input = sc.nextLine();
            waiting.addTask(input);
            System.out.print("Add Another Task? true or false: ");
            repeat = sc.nextLine().toLowerCase();
        }

        waiting.printWaitingTasks();
        inProgress.printTasksInProgress();
        done.printDoneTasks();

        System.out.println("Do you want to move a Task| true or false");
        fromwhere = sc.nextLine().toLowerCase();
        if (fromwhere.equals("true")) {
            System.out.println("From which State?: ");
            fromwhere = sc.nextLine().toLowerCase();
            System.out.println("The complete Text of the task to Move");
            task = sc.nextLine().toLowerCase();
            System.out.println("To wich state");
            towhere = sc.nextLine().toLowerCase();

            if (fromwhere.equals("waiting")) {
                waiting.removetask(task);
                if (towhere.equals("in progress")) {
                    inProgress.addTask(task);
                } else if (towhere.equals("done")) {
                    done.addTask(task);
                }
            } else if (fromwhere.equals("in progress")) {
                inProgress.removetask(task);
                if (towhere.equals("in progress")) {
                    inProgress.addTask(task);
                } else if (towhere.equals("done")) {
                    done.addTask(task);
                }
            }

        }
    }

}
