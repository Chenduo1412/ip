package Duke;

import java.util.ArrayList;

public class Parser {
    private ArrayList<Task> tasks;
    private int arrSize;

    public Parser(ArrayList<Task> tasks,int arrSize){
        this.tasks = tasks;
        this.arrSize=arrSize;

    }
    public void storeInArray(Task t) {
        tasks.add(t);
    }
    public  void deleteInArray(int index) throws DukeException{
        tasks.remove(index);
    }

}