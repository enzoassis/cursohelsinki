import java.util.Scanner;

public class ex3print_Integer {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //READING INTEGERS - CONVERT STRING TO INT
        //conversão por scanner
        System.out.println("Digite o valor que quer converter para integer: ");
        int value_as_string = Integer.valueOf(scanner.nextLine());
        System.out.println(value_as_string);

        //conversão direta
        String value_as_string2 = "66";
        int value = Integer.valueOf(value_as_string2);

        System.out.println(value);
    }
}
