import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What do you want to do? ");
        System.out.print(" Enter 'add', 'subtract', 'divide', 'multiply': ");
        String action = scanner.nextLine();
        System.out.println("Preparing to do math... ");

        if (action.equals("add")) {
            System.out.println(num1 + num2);
        } else if (action.equals("subtract")) {
            System.out.println(num1 - num2);
        } else if (action.equals("divide")) {
            System.out.println(num1 / num2);
        } else if (action.equals("multiply")) {
            System.out.println(num1 * num2);
        } else {
            System.out.println("I don't understand that command.");
        }
    }
}
