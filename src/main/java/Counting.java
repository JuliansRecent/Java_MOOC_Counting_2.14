
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt the user for an input
        int number = Integer.valueOf(scanner.nextLine());

        // in a loop, print all the numbers counting up to the number given then exit
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }
}
