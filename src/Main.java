
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String mas[] = str.trim().split(" ");

        System.out.println(new IsValids().isValid(mas));

    }
}
