import java.util.ArrayList;
import java.util.Iterator;

public class TaskManager {
    private ArrayList<Task> tasks;


public TaskManager(){
    tasks = new ArrayList<>();
}
 public void addTask(Task task){
    tasks.add(task); // listeye ekle
    System.out.println("Task added successfulyy");
 }

 public Task getTask(int id){
    for(Task t : tasks) // her elemanı tek tek verir
    {
        if(t.getId()==id){
            return t;
        }
    }
    return null; //bulunamadı
 }


}
