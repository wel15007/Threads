import java.util.*;

public class ExceptionHandlingExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isDivisble = false;
        do {
            try {
                System.out.print("Enter number 1: ");
                int number1 = input.nextInt();

                System.out.print("Enter number 2: ");
                int number2 = input.nextInt();

                int sum = number1 / number2;

                System.out.println(sum);
               isDivisble = true;
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        } while(!isDivisble);
    }
}