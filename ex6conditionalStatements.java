import java.util.Scanner;

public class ex6conditionalStatements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write a number between 1 and 100:");
        int number = Integer.valueOf(scan.nextLine());

        if (number >= 1 && number<=100 && number%3 == 0 && number%5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number >= 1 && number<=100 && number%3 == 0) {
            System.out.println("Fizz");
        } else if (number >= 1 && number<=100 && number%5 == 0) {
            System.out.println("Buzz");
        } else if (number >= 1 && number<=100) {
            System.out.println(number);
        } else {
            System.out.println("Try again!");
        }
    }
    
}

