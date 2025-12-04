public class Task {
    private int id;
    private String title;
    private String description;
    private String dueDate;
    private boolean completed;
    
    public Task(int id, String title,String description , String dueDate, boolean completed){
        this.id=id;
        this.title=title;
        this.description=description;
        this.dueDate=dueDate;
        this.completed=completed;
    }
    
    public int getId() {
        return id;
    }
    
    public  String getTitle() {
        return title;
    }
    public String getDescription(){
        return description;
    }

    public String getDuaDate() {
        return dueDate;
    }
    
    public boolean isCompleted() {
        return completed;
    }

    public void toggleCompleted(){
        this.completed = !this.completed;
    }

     @Override
   public  String toString() {
        return "ID: " + id + 
               "\nTitle :" + title + 
               "\nDescription : " + description + 
               "\nDue Date :" +  dueDate +
               "\nStatus :" + completed;
    }
}

