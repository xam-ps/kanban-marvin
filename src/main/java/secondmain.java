public class secondmain {
    public static void main(String[] args) {
        KanbanBoard kanbanBoard = new KanbanBoard();
        kanbanBoard.addTask("This is a new task");
        kanbanBoard.addTask("This is another task");
        kanbanBoard.addTask("This is the 3rd task");
        kanbanBoard.printTask();

        kanbanBoard.updateState("This is another task", "needsdiscussion");
        kanbanBoard.updateState("This is the 3rd task", "done");
        kanbanBoard.printTask();

        kanbanBoard.nextState("This is the 3rd task");
        kanbanBoard.printTask();
    }
}
