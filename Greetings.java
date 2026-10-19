import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Close the scanner to prevent a resource leak
        scanner.close();
        
        // Call the greeting method
        greetUser(name);
    }
    
    /**
     * Prints a personalized greeting message.
     */
    public static void greetUser(String name) {

        System.out.println("Hello, " + name + "! Thhis is java programming written by dev A");        System.out.println("Hello, " + name + "! Good Morning Satej by dev 2");
        System.out.println("Hello, " + name + "! Good Morning by PD Dev");
    }
}

