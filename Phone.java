import java.util.Scanner;
import java.text.DecimalFormat;

public class Phone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#");
        int decPlace = 0;
        boolean runProgram = true;

        System.out.println("This program will print out PI to the decimal place of your choosing.");

        while (runProgram == true) {
            System.out.print("\nEnter the number of decimal places (up to 10) that \nyou would like to print PI to: ");
            decPlace = input.nextInt();

            switch (decPlace) {
                case 0:
                    format = new DecimalFormat("#");
                    break;
                case 1:
                    format = new DecimalFormat("#.#");
                    break;
                case 2:
                    format = new DecimalFormat("#.##");
                    break;
                case 3:
                    format = new DecimalFormat("#.###");
                    break;
                case 4:
                    format = new DecimalFormat("#.####");
                    break;
                case 5:
                    format = new DecimalFormat("#.#####");
                    break;
                case 6:
                    format = new DecimalFormat("#.######");
                    break;
                case 7:
                    format = new DecimalFormat("#.#######");
                    break;
                case 8:
                    format = new DecimalFormat("#.########");
                    break;
                case 9:
                    format = new DecimalFormat("#.#########");
                    break;
                case 10:
                    format = new DecimalFormat("#.##########");
                    break;
            }

            System.out
                    .println("\nThe value of PI to " + decPlace + " decimal places is " + format.format(Math.PI) + ".");

            runProgram = AskRunAgain(input);
        }

        input.close();
    }

    static boolean AskRunAgain(Scanner askUser) {
        String userChoice;

        System.out.print("\nWould you like to run the program again? [y/n]: ");
        userChoice = askUser.nextLine();

        if ((userChoice.equals("y")) || (userChoice.equals("Y")) || (userChoice.equals("yes"))
                || (userChoice.equals("Yes")) || (userChoice.equals("YES"))) {
            return true;
        } else if ((userChoice.equals("n")) || (userChoice.equals("N")) || (userChoice.equals("no"))
                || (userChoice.equals("No")) || (userChoice.equals("NO"))) {
            System.out.println("\nExiting the program. have a good day!");
            return false;
        } else {
            System.out.println("Sorry, there was an error.");
            return false;
        }
    }
}