import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args) {
        Scanner keyboard;

        String question;
        int number;
        String again;

        keyboard = new Scanner(System.in);
        do {
            System.out.println("Welcome to Magic 8 Ball, what is your question?");
            question = keyboard.nextLine();
            System.out.println("Choose a number from 1 to 100.");
            number = keyboard.nextInt();
            keyboard.nextLine();

            if (number >= 1 && number <= 10) {
                System.out.println("Yes.");

            } else if (number >= 11 && number <= 20) {
                System.out.println("No.");

            } else if (number >= 21 && number <= 30) {
                System.out.println("Absolutely.");

            } else if (number >= 31 && number <= 40) {
                System.out.println("Absolutely not.");

            } else if (number >= 41 && number <= 50) {
                System.out.println("Sure.");

            } else if (number >= 51 && number <= 60) {
                System.out.println("No way.");

            } else if (number >= 61 && number <= 70) {
                System.out.println("Without a doubt.");

            } else if (number >= 71 && number <= 80) {
                System.out.println("You've got to be kidding.");

            } else if (number >= 81 && number <= 90) {
                System.out.println("Heck yah.");

            } else if (number >= 91 && number <= 100) {
                System.out.println("Heck nah.");
            }

            System.out.println("Would you like to play again? (yes or no).");
            again = keyboard.nextLine().toLowerCase();

        }while(again.equals("yes"));
        System.out.println("Ok, goodbye!");
        }

}

