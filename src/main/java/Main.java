import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KanbanBoard kanbanBoard = new KanbanBoard();
        Scanner sc = new Scanner(System.in);
        String input;
        String repeat = "true";
        while (repeat.equals("true")) {
            System.out.print("Add a Task: ");
            input = sc.nextLine();
            kanbanBoard.addTask(input);
            System.out.print("Add Another Task? true or false: ");
            repeat = sc.nextLine().toLowerCase();
        }
        kanbanBoard.printTask();

        kanbanBoard.updateState("This is another task", "NEEDS_DISCUSSION");
        kanbanBoard.updateState("This is the 3rd task", "DONE");
        kanbanBoard.printTask();

        kanbanBoard.nextState("This is the 3rd task");
        kanbanBoard.printTask();
    }
}
