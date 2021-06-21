
import java.util.*;

public class Hello_2 {

    static void scaner() {
        Scanner scano = new Scanner(System.in);
        System.out.println("Please Input the value of your integer");
        int i = scano.nextInt();
        System.out.println("Please Input the value of your Double");
        double d = scano.nextDouble();
        System.out.println("Please Input the value of your String");
        scano.nextLine();
        String s = scano.nextLine();
        scano.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    static void forloops() {

        int[] myarr1 = { 32, 5, 33, 67, 87 };
        int sum = 0;
        for (int x = 0; x < myarr1.length; x++) {
            sum += myarr1[x];
            /* This adds all the elements in this array */
        }
        System.out.println("The value of all the elements in the array is: " + sum);

    
        int[] primes = { 2, 3, 5, 7 };
        for (int loop : primes) {
            System.out.println(loop);
        }

        for (int x = 10; x <= 50; x += 10) {
            if (x == 30) {
                System.out.println("The Continue statement skips 30 here");
                /* The number 30 is skipped because of the continue statement */
                continue;

            }
            System.out.println(x);
        }

    }

    static void nestedifs() {

        Scanner page = new Scanner(System.in);
        System.out.println("Please input your age in integer format");
        int age = page.nextInt();
        page.close();

        if (age > 0) {
            if (age > 16) {
                System.out.println("Welcome!");
            } else {
                System.out.println("Too Young!");
            }
        } else {
            System.out.println("Error!");
        }

        int x = 1;
        while (x > 0) {
            System.out.println(x);
            if (x == 4) {
                break;
            }
            x++;
            /*
             * This is kinda of like having a for loop with a known limit or expected end
             */
        }
    }

    static void Range() {

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Even/Odd -> Please Input the value of your integer");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // If n is odd, print Weird
        if (n % 2 == 1) {
            System.out.println("Weird");
        }
        // If n is even and in the inclusive range of 2 to 5, print Not Weird
        else if (n % 2 == 0 && (n >= 2 && n <= 5)) {
            System.out.println("Not Weird");
        }

        // If n is even and in the inclusive range of 6 to 20, print Weird
        else if (n % 2 == 0 && (n >= 6 && n <= 20)) {
            System.out.println("Weird");
        }

        // If n is even and greater than 20, print Not Weird
        else if (n % 2 == 0 && (n > 20)) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Number is out of bounds");
        }

        scanner.close();
    }

    static void logicals() {

        @SuppressWarnings("resource")
        Scanner age = new Scanner(System.in);
        // int age = getage.nextInt();
        // age.close();

        @SuppressWarnings("resource")
        Scanner money = new Scanner(System.in);
        // money.close();

        System.out.println("Your Age And Money Respectively " + " Punk!");

        // AND
        if (age.nextInt() > 18 && money.nextInt() > 500) {
            System.out.println("Welcome! This shows the AND Statement:");
        } else {
            System.out.println("Get out of here You Broke Ass Nigga ");
        }

        // OR
        if (age.nextInt() > 18 || money.nextInt() > 500) {
            System.out.println("This shows the OR Statement: ");
        }

        // NOT
        if (!(age.nextInt() > 18)) {
            System.out.println("Too Young: ");
        } else {
            System.out.println("Welcome ");
        }

    }

    static void Arrays() {
        /* Array Syntax -> int [] arr = new int [5]; */

        String[] myNames = { "a", "b", "c", "d", "e" };
        int[] myNums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

        for (int loop = 0; loop < myNames.length; loop++) {
            System.out.println(myNames[loop] + " \n ");
        }

        int total = 0;
        for (int loop : myNums) {
            System.out.println("myNums[" + (loop - 1) + "] = " + loop);
            total += loop;
            System.out.println("The Sum of the Array called myNums is: " + total + " at myNums[" + loop + "]");
        }

        System.out.println(" \n" + "Therefore the Sum of the Array called myNums is:-> " + total);

        // Multi-Dimensional Arrays
        int[][] sample = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        int x = sample[1][0];
        System.out.println(x);// The First element in second array
        int[][] crabay = { { 1, 2, 3, 4 }, { 24 }, { 5, 6, 7, 8 } };
        crabay[0][2] = 42;
        int bex = crabay[1][0];
        System.out.println(bex + "   " + crabay[0][2]);// 24 42

        int array1[] = new int[3];
        for (int i = 0; i < 3; i++)
            array1[i] = i;

        int res = array1[1] + array1[2] * array1[2];
        System.out.println(res);// 5

        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                result += 10;
            } else {
                result += i;
            }
        }
        System.out.println("\n" + result);// 17

        int resilience = 0;
        for (int loop : myNums) {
            resilience += loop;
        }
        System.out.println("\n" + resilience);
    }

    static void PhoneBills() {
        Scanner scan = new Scanner(System.in);
        int phonebills[] = new int[12];
        // phonebills[12] = data.nextInt();
        float sum = 0, average;
        int i;
        scan.close();
        
        for (i = 0; i < 12; i++) {
            System.out.print((i + 1) + "=>$");
            phonebills[i] = scan.nextInt();
        }
        // System.out.println(phonebills[i]);
        for (i = 0; i < 12; i++) {
            sum += phonebills[i];
        }
        
        average = sum / (float) 12;
        System.out.println("\nYour average phonebill for 12 months is $" + average);
    }

    public static void main(String[] args) {
        /*-----------------------------------------------------------------------*/
        String answer = "yes";
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Hello_2 world");
            scaner();
            // forloops();
            // nestedifs();
            // Range();
            // logicals();
            // Arrays();
            //PhoneBills();
            System.out.println("Do You Want To Continue: Yes or No ");
            answer = input.nextLine();
            input.close();
        } while (answer == "yes" || answer == "Yes");

        /*-----------------------------------------------------------------------*/

    }

}

/*
 * String answer = "y"; while (answer == "y" || answer == "Y") {
 * System.out.println("Hello_2 world"); scaner(); forloops(); }
 * 
 * System.out.println("Do You Want To Continue");
 * System.out.println("y = yes and n = no"); Scanner ans = new Scanner
 * (System.in); answer = ans.nextLine(); ans.close();
 */