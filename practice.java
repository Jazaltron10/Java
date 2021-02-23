import java.security.PublicKey;
import java.util.Scanner;

public class practice {
    static void basicadd() {
        System.out.println("Hello world this program works");
        int a, b, sum;
        a = 89;
        b = 45;
        sum = a + b;
        System.out.println("The sum of a and b is :-> " + sum);
        addition();// here as you can see i am calling the addition function
        // in the basicadd function.
    }

    static void letterscan() {
        Scanner leko = new Scanner(System.in);
        System.out.println("Please input your number ");
        String intro = leko.nextLine();
        leko.close();

        System.out.println("Welcome candidate No: " + intro + " to the jazaltron paradise");

    }

    static void addition() {
        Scanner check = new Scanner(System.in);
        System.out.println("Please Input the value of a");
        int a = check.nextInt();
        System.out.println("Please Input the value of b");
        int b = check.nextInt();
        check.close();

        int sum;
        sum = a + b;
        System.out.println("The sum of the integer's a and b is :-> " + sum);
    }

    static void TimeConverter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number of days in integer format:-> ");
        int days = scanner.nextInt();
        int seconds, minutes, hours;
        scanner.close();
        hours = days * 24;
        minutes = hours * 60;
        seconds = minutes * 60;

        System.out.println(days + " days is equal to " + seconds + " seconds");

    }

    static void LoanCalculator_1() {
        Scanner money = new Scanner(System.in);
        int amount = money.nextInt();
        int month0, month1, month2, month3, month4, month5, month6;
        int payment1, payment2, payment3, payment4, payment5, payment6;
        money.close();
        month0 = amount;

        payment1 = month0 / 10;
        month1 = month0 - payment1;
        // System.out.println(month1);

        payment2 = month1 / 10;
        month2 = month1 - payment2;
        // System.out.println(month2);

        payment3 = month2 / 10;
        month3 = month2 - payment3;
        // System.out.println(month3);

        payment4 = month3 / 10;
        month4 = month3 - payment4;
        // System.out.println(month4);

        payment5 = month4 / 10;
        month5 = month4 - payment5;
        // System.out.println(month5);

        payment6 = month5 / 10;
        month6 = month5 - payment6;
        System.out.println("Therefore after 6 months the amount remaining is " + (month6 - 1));

    }

    static void LoanCalculator_2() {
        Scanner money = new Scanner(System.in);
        int amount = money.nextInt();
        money.close();
        int payment = 0;
        for (int x = 1; x < 7; x++) {
            payment = amount / 10;
            amount -= payment;
        }
        {
            System.out.println((amount - 1));
        }
    }

    static void LoanCalculator_3() {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        scanner.close();
        for (int i = 0; i < 6; i++) {
            amount = amount * 0.9;
            if (i == 5) {
                int final_loan = (int) amount;
                System.out.println(final_loan);
            }
        }
    }

    static void LoanCalculator_4() {
        //This one works for sololearn 
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int rem_amt = amount;
        scanner.close();
        for (int i = 1; i <= 6; i++) {
            int paid = (int) Math.ceil(10 / 100.0 * rem_amt);
            rem_amt -= paid;
        }
        System.out.println(rem_amt);
    }

    /*import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int width = read.nextInt();
       int height = read.nextInt();
       printArea(width, height);
   
   }

   //complete the method
   public static void printArea(int width, int height) {
       int area = width * height;
       System.out.println(area);
   }
} */

    public static void main(String[] args) {
        // basicadd();
        // letterscan();
        // addition();
        // TimeConverter();
        // LoanCalculator_1();
        // LoanCalculator_2();
        //LoanCalculator_3();
        LoanCalculator_4();
    }

}