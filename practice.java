// import java.security.PublicKey;
import java.util.Scanner;

public class practice {
    static void basicadd() {
        System.out.println("Hello world this program works");
        int a, b, sum;
        a = 89;
        b = 45;
        sum = a + b;
        System.out.println("The sum of a and b is :-> " + sum);
        //addition();// here as you can see i am calling the addition function
        // in the basicadd function.
    }

    static void letterscan() {
        Scanner leko = new Scanner(System.in);
        System.out.println("Please input your number ");
        String intro = leko.nextLine();
        //leko.close();

        System.out.println("Welcome candidate No: " + intro + " to the jazaltron paradise");

    }

    static void addition() {
        Scanner check = new Scanner(System.in);
        System.out.println("Please Input the value of a");
        int a = check.nextInt();
        System.out.println("Please Input the value of b");
        int b = check.nextInt();
        //check.close();

        int sum;
        sum = a + b;
        System.out.println("The sum of the integer's a and b is :-> " + sum);
    }

    static void TimeConverter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number of days in integer format:-> ");
        int days = scanner.nextInt();
        int seconds, minutes, hours;
        //scanner.close();
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
        //money.close();
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
        //money.close();
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
        //scanner.close();
        for (int i = 0; i < 6; i++) {
            amount = amount * 0.9;
            if (i == 5) {
                int final_loan = (int) amount;
                System.out.println(final_loan);
            }
        }
    }

    static void LoanCalculator_4() {
        // This one works for sololearn
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int rem_amt = amount;
        //scanner.close();
        for (int i = 1; i <= 6; i++) {
            int paid = (int) Math.ceil(10 / 100.0 * rem_amt);
            rem_amt -= paid;
        }
        System.out.println(rem_amt);
    }

    public static void printArea(int width, int height) {
        int area = width * height;
        System.out.println("The area of the given quad with width of: " + width + "cm and height of: " + height
                + "cm is:-> " + area + "cm");
    }

    static void snippet() {

        // Assign a number value to firstNum
        int firstNum = 453;

        // Assign a number value to secondNum
        int secondNum = 654;

        // Add firstNum and secondNum and print the total.
        int totalSum = firstNum + secondNum;
        System.out.println("The total sum of the two integers is: " + totalSum);

        // Assign a new number value to firstNum
        firstNum = 43;
        // Assign a new number value to secondNum
        secondNum = 45;

        // Add firstNum and secondNum after changing their values and assign the total
        // to totalSum again
        totalSum = firstNum + secondNum;

        // Print the new total
        System.out.println("The total sum of the two integers is: " + totalSum);
    }

    static void Workingstrings() {

        String firstName = "John";

        System.out.println("\n\nfirstName is " + firstName);

        String lastName = " Smith";

        System.out.println("lastName is " + lastName);

        System.out.print("Concat using concat() function, full name is:");

        System.out.println(firstName.concat(lastName));

        System.out.print("Concat using + operator, full name is:");

        System.out.println(firstName + lastName);
    }

    static void lengthOfStrings() {
        // The length() method returns the length of string.

        String firstName = "John";

        System.out.println("\n\n" + firstName + " is " + firstName.length() + " characters long");

        firstName = "Linda";

        System.out.println(firstName + " is " + firstName.length() + " characters long");

    }

    static void ObtainCharFromString() {
        // The charAt() method returns a character at specified index:

        String firstName = "John";

        System.out.println("\n\nThe first character of " + firstName + " is " + firstName.charAt(0));

        System.out.println("The fourth character of " + firstName + " is " + firstName.charAt(3));
    }

    static void PositionOfCharInString() {
        /*
         * This indexOf() method returns the index position within this string of the
         * first occurrence of the specified character or -1, if the character does not
         * occur.
         */

        String firstName = "John";

        System.out.println("\n\nFirst occurrence of the letter 'J' is at "

                + firstName.indexOf('J'));

        System.out.println("First occurrence of the letter 'a' is at "

                + firstName.indexOf('a'));
    }

    static void ReplaceCharInString() {
        /*
         * The replace() method replaces all occurrence of first sequence of character
         * with second sequence of character.
         */

        String fullName = "John Smith";
        System.out.println("\n\nfullName is " + fullName);
        String replacedName = fullName.replace("John", "Linda");
        System.out.println("Name after replacing is " + replacedName);
    }

    static void GetPartOfString() {
        /*
         * The substring() method returns new string that is a sub-string of the
         * original string. The substring() method begins with the character at the
         * specified index and extends to the end of this string or up to endIndex – 1,
         * if the second argument is provided.
         */

        String fullName = "John Smith";
        // This will fetch the sub string from the character at index 0 till 4
        // (4 is exclusive)
        String firstName = fullName.substring(0, 4);
        System.out.println("\n\nfirstName is " + firstName);// Print firstName
        // This will fetch the sub string from the character at index 5 till the
        // end
        String lastName = fullName.substring(5);
        System.out.println("lastName is " + lastName);// Print lastName

    }

    static void NumStringConversion() {
        // Converting a number to string
        // To convert a number to a string,
        // use the toString() method of the Integer class

        // Converting a string to number
        // The parseInt() function of the
        // Integer class converts the String object to int

        int number = 128;
        // Convert variable 'number' to a string
        String numberAsString = Integer.toString(number);
        System.out.println("\n\nValue of number as string is " + numberAsString);

        // Convert string numberAsString back to a number
        number = Integer.parseInt(numberAsString);
        System.out.println("Value of number is " + number);
    
    /* NOte this 
    Integer boxedValue = Integer.valueOf(238);
    String characterNumeric = boxedValue.toString();

    String characterNumeric = "238";
    Integer convertedValue = Integer.parseInt(characterNumeric);
     */
    }

    static void Operators() {
        /*
         * When both operands are integers (operands are the values the operator works
         * on), the result is also an integer. Also, by convention, integer division
         * always rounds down, even in cases such as when the next integer is so close.
         * 
         * 
         * Multiplication and division occur before addition and subtraction. Therefore,
         * 2*3-1 yields 5 (not 4) and 2/3-1 yields -1, not 1 (remember that in integer
         * division 2/3 is 0).
         * 
         * 
         * If the operators feature the same precedence, they are evaluated from left to
         * right. Therefore, in the expression minute*100/60, the multiplication happens
         * first.
         * 
         * 
         * When you want to override the rules of precedence (or you are not sure what
         * they are), you can use parentheses. Expressions in parentheses are evaluated
         * first; therefore, 2 *(3-1) is 4. You can also use parentheses to make an
         * expression easier to read, as in (minute * 100) / 60, although the result is
         * not changed.
         */

    }

    static void TempConversion() {
        System.out.println();

        int celsius = 100;

        // Using operators to convert from celsius to fahrenheit
        // To convert temperatures in degrees Celsius to Fahrenheit, multiply
        // //by 1.8 (or 9/5) and add 32.

        int fahrenheit = celsius * 9 / 5 + 32;

        String message = celsius + " C is " + fahrenheit + " F.";

        System.out.println(message);

        // To convert temperatures in degrees Fahrenheit to Celsius, subtract
        // //32 and multiply by .5556 (or 5/9).
        // And back to celsius to validate the answer

        int fahrenheitToCelsius = (fahrenheit - 32) * 5 / 9;

        message = fahrenheit + " F is " + fahrenheitToCelsius + " C.";

        System.out.println(message);
    }

    static void AreaPerimeterOfCircle() {
        int radius = 5;

        // Area of a circle can be calculated
        // using PI(R Squared)
        double area = Math.PI * (Math.pow(radius, 2/* radius */));
        System.out.println("\n\nArea of the circle is " + area);

        // Area of a circle can be calculated
        // using the formula 2PIr
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle is " + circumference);

        // Assign the rounded value of circumference
        // to roundedCircumference
        double roundedCircumference = Math.round(circumference);
        System.out.println("Circumference of the circle" + " after rounding is " + roundedCircumference);

    }

    static void WhilMultiples() {
        int maxNum = 100;

        // Initially the sum is zero
        int sum = 0;
        int currentNum = 1;

        // While loop
        while (currentNum < maxNum) {
            // Check if currentNum is a multiple of both 3 and 5 in
            // below 'if' condition
            if (currentNum % 3 == 0 && currentNum % 5 == 0) {
                // If 'currentNum' is multiple of both 3 and 5 ,
                // then add it to 'sum'
                sum += currentNum;
            }
            currentNum++;
        }
        System.out.println("The sum of numbers that" + " are multiples of 3 and 5 under " + maxNum + " is " + sum);
    }

    public static void main(String[] args) {

        basicadd();
        letterscan();
        addition();
        TimeConverter();
        LoanCalculator_1();
        LoanCalculator_2();
        LoanCalculator_3();
        LoanCalculator_4();
        
        /*
         * Scanner read = new Scanner(System.in);
         * System.out.println("Please input the value of the width "); int width =
         * read.nextInt(); System.out.println("Please input the value of the height ");
         * int height = read.nextInt(); read.close(); printArea(width, height);
         * 
         */
        // snippet();
        // Workingstrings();
        // lengthOfStrings();
        // ObtainCharFromString();
        // PositionOfCharInString();
        // ReplaceCharInString();
        // GetPartOfString();
        // NumStringConversion();
        // Operators();
        // TempConversion();
        // AreaPerimeterOfCircle();
        // System.out.println("\n\n" + (98>432));
        WhilMultiples();
    }

}
