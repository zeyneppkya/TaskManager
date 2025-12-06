import java.util.ArrayList;
import java.util.Iterator;

public class TaskManager {
    private ArrayList<Task> tasks;


public TaskManager(){
    tasks = new ArrayList<>();
}
 public void addTask(Task task){
    tasks.add(task); // listeye ekle
    System.out.println("Task added successfully");
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
 // ıterator kullanarak silme
public boolean removeTask(int id){
    Iterator<Task> it = tasks.iterator();
    while(it.hasNext()){
        Task t =  it.next();
        if(t.getId()==id){
            it.remove();
            System.out.println("Task removed.");
            return true;
        }
    }
    return false; // bulunamadı
}
// tüm listeyi yazdırma
public void listTasks(){
    if(tasks.isEmpty()){
        System.out.println("no tasks available");
        return;
    }
    for(Task t : tasks){
        System.out.println(t); // toString methodu çağırılıyor
        System.out.println(" -------------------");
    }
}

// durum güncelleme
public boolean toggleTaskStatus(int id){
    Task t = getTask( id);
    if(t==null) return false;
    t.toggleCompleted();
    System.out.println("Task status updated.");
    return true;
}


}
