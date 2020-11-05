import java.util.*;


public class DataValidationExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;
        boolean isNumber;

        do {
            System.out.print("Please enter a whole number: ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                isNumber = true;
                System.out.println(number);
            }
            else {
                System.out.println("Invalid input, try again");
                isNumber = false;
                input.next();
            }
        } while (!isNumber);
    }
}
