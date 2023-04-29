import java.math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userNumber = 0;
        int aiNumber = (int)Math.floor(Math.random() * 100);
        int count = 0;

        System.out.println("ai number " + aiNumber);

        System.out.println("eneter your num");



        while (userNumber != aiNumber) {
            userNumber = scanner.nextInt();

            if(userNumber > aiNumber) {
                System.out.println("Your number is too high");
                count++;
                System.out.println("Amount of tries " + count);
            } else if (userNumber < aiNumber) {
                System.out.println("your number is too low");
                count++;
                System.out.println("Amount of tries " + count);
            } else {
                System.out.println("You won!");
                System.out.println("Amount of tries " + count);
            }
        }

    }
}
