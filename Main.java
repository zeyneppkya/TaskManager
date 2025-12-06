import java.util.Scanner;

public class Main {
    public static void main( String [] args){
    TaskManager manager = new TaskManager();
    Scanner scanner = new Scanner(System.in);
    while(true){
        System.out.println( "1 - Add Task"+
                            "\n2 - List Tasks"+
                            "\n3 - Remove Task"+
                            "\n4 - Toggle Task Status"+
                            "\n5 - Exit"+
                            "\n Choose an aption:"
        );

      int choice= scanner.nextInt();
      scanner.nextLine(); // nextInt() sonrası Enter tuşunu temizle, aksi takdirde nextLine() boş string döner
      switch(choice){
        case 1:
            break;

        case 2:

            break;

        case 3:
            break;

        case 4:
            break;


        case 5:
            break;

        default: 
        System.out.println("Invalid option.");
      }
      scanner.close();
    }


} 
}
