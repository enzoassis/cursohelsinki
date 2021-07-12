import java.util.Scanner;

public class ex4printDouble {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //conversão direta
        String valueAsString = "42.42";
        double value = Double.valueOf(valueAsString);
       
        System.out.println(value);

        //conversão por scanner
        System.out.println("Write a value ");
        double value2 = Double.valueOf(scanner.nextLine());
       
        System.out.println("You wrote " + value2);
    }
}
