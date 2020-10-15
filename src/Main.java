
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();

            String mas[] = str.toUpperCase().trim().split(" ");

            System.out.println(new MathOperations().mathOperat(mas));
        }

    }
}
