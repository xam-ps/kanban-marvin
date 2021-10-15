package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KanbanBoard kanbanBoard = new KanbanBoard();
        Scanner sc = new Scanner(System.in);
        String input;
        String task;
        String repeat = "true";
        while (repeat.equals("true")) {
            System.out.print("Add a Task: ");
            input = sc.nextLine();
            kanbanBoard.addTask(input);
            System.out.print("Add Another Task? true or false: ");
            repeat = sc.nextLine().toLowerCase();
        }
        kanbanBoard.printTask();

        System.out.println("Do you want to move a task? true or false: ");
        repeat = sc.nextLine().toLowerCase();
        if (repeat.equals("true")) {
            System.out.println("Wich task(Complete Text): ");
            task = sc.nextLine();
            while (repeat.equals("true")) {
                System.out.print("Choose state self or next state? c oder n: ");
                input = sc.nextLine().toLowerCase();
                if (input.equals("c")) {
                    System.out.println("In wich state?: ");
                    input = sc.nextLine();
                    kanbanBoard.updateState(task, input);
                } else if (input.equals("n")) {
                    kanbanBoard.nextState(task);
                } else {
                    System.out.println("Wrong Input");
                }
                System.out.print("Move another Task? true or false: ");
                repeat = sc.nextLine().toLowerCase();
            }
        }

        kanbanBoard.printTask();
    }
}
