import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

class Main {
  
	public static void main(String[] args) throws FileNotFoundException {

    boolean keepAlive = true;
		while(keepAlive){
      keepAlive = Menus.displayMainMenu();
    }
    
	}
  
}

class Menus{
  
  public static boolean displayMainMenu() throws FileNotFoundException {
    
    System.out.println("Press 1 to learn about salary.");
    System.out.println("Press 2 to learn about the job.");
    System.out.println("Press 3 to learn about demand.");
    System.out.println("Press 4 to view current students.");
    System.out.println("Press 5 to quit.");

    Scanner consoleScanner = new Scanner(System.in);
    int path = consoleScanner.nextInt();
    
    switch (path){
      case 1: { System.out.println("$98,345 average salary in South Florida!"); return true; }
      case 2: { System.out.println("US News - 100 Best Jobs!"); return true; }
      case 3: { System.out.println("Top 10 Forbes In-Demand Jobs!"); return true; }
      case 4: { Menus.printNames(); return true; }
      default: return false;
    }
    
  }

  public static boolean printNames() throws FileNotFoundException {
    
    FileReader fr = new FileReader("names.txt");
    Scanner fileScanner = new Scanner(fr);
    
    while(fileScanner.hasNext())
    { System.out.println(fileScanner.nextLine()); }
    
    return true;
  }
  
}
