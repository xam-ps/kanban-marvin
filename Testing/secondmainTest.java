import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class secondmainTest {
    @Test
public void test(){
    KanbanBoard test=new KanbanBoard();
    test.addTask("Blub");
    test.updateState("Blub","inprogress");
    test.nextState("Blub");
    test.printTask();
    }
}
