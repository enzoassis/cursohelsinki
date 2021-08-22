public class ex9While {
    public static void main(String[] args) {
        
        int number = 0;

        while (true) {
            number = number + 1;
            
            if(number > 10){
                break;
            }
            System.out.println(number + " ");
        }
    }
}
