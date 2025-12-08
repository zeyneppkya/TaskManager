import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TaskManager manager = new TaskManager(); 
        Scanner scanner = new Scanner(System.in); 
        int nextId = 1; // Task ID için otomatik artan sayı

        while (true) { 
            System.out.println(
                    "\n--- TASK MANAGER ---" +
                    "\n1 - Add Task" +
                    "\n2 - List Tasks" +
                    "\n3 - Remove Task" +
                    "\n4 - Toggle Task Status" +
                    "\n5 - Exit" +
                    "\nChoose an option: "
            );

            int choice = scanner.nextInt(); 
            scanner.nextLine(); // nextInt sonrası buffer temizleme

            switch (choice) {
                case 1: // Görev ekleme
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();

                    System.out.print("Enter task due date (yyyy-mm-dd): ");
                    String dueDate = scanner.nextLine();

                    
                    Task newTask = new Task(nextId, title, description, dueDate, false);
                    manager.addTask(newTask);
                    nextId++; 
                    break;

                case 2: // Görevleri listeleme
                    manager.listTasks();
                    break;

                case 3: // Görev silme
                    System.out.print("Enter Task ID to remove: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine();
                    if (!manager.removeTask(removeId)) {
                        System.out.println("Task not found.");
                    }
                    break;

                case 4: // Görev durumunu değiştirme
                    System.out.print("Enter Task ID to toggle status: ");
                    int toggleId = scanner.nextInt();
                    scanner.nextLine();
                    if (!manager.toggleTaskStatus(toggleId)) {
                        System.out.println("Task not found.");
                    } else {
                        System.out.println("Task status updated.");
                    }
                    break;

                case 5: // Çıkış
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default: // Geçersiz seçenek
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
