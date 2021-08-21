import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        //creating scanner
        Scanner scanner = new Scanner(System.in);
        
        //training1 -- using scanner for the 1st time
        System.out.println("Write a message: ");
        String message = scanner.nextLine();

        System.out.println("\n" + message);

        //training2 -- concatenating/joining strings together
        System.out.println("\n\nWhat is you name?");
        String name = scanner.nextLine();

        System.out.println("\nMy name is " + name);

        /*
        seeing how it is possible to mix the variable entered by the user utilizing the scanner function with a predetermined String variable, means it is also possible to write full line sentences using both of these methods
        */

        //training3 -- joining even more strings
        String name2 = "Sei lá eu", country = "Não sei";
        int age = 19;

        System.out.println("\n\nTem pais? ");
        String answer = scanner.nextLine();

        if (answer. equals("sim")) {
            System.out.println("\nNome: " + name2 + "\nPaís: " + country + "\nIdade: " + age + "\nTem pais? " + answer);
        } 
        else if (answer. equals("nao")) {
            System.out.println("Não fique triste, Naruto também não tinha pais...");
        } 
        else {
            System.out.println("Cê é burro mano? Responde com sim ou nao.");
        }

        scanner.close();
        
    }
}
