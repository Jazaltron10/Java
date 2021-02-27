
public class Practice_2 {

    static void BooleanValues() {

        // Two boolean variable on and off are defined with boolean
        // booleaniables true and false
        boolean on = true;
        boolean off = false;
        System.out.println(on);
        System.out.println(off);

        // Using comparator operators
        System.out.println(3 > 2);
        System.out.println(3 == 2);

        // Using logical operators
        System.out.println(on && off);
        System.out.println(off || on);
        System.out.println(!on);
        System.out.println(on ^ off);

    }

    static void PositiveOrNegative() {
        int x = -10;
        if (x > 0) {
            System.out.println("\nx is positive");
        } else if (x < 0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is zero");
        }
    }

    static void compare_one() {
        // Assign values to num1 and num2
        int num1 = 10;
        int num2 = 15;

        if (num1 > num2) {
            System.out.println("The larger of " + num1 + " and " + num2 + " is " + num1 + ".");
        } else if (num2 > num1) {
            System.out.println("The larger of " + num1 + " and " + num2 + " is " + num2 + ".");
        } else {
            System.out.println("The values " + num1 + " and " + num2 + " are equal.");
        }
    }

    static void RangeGrade() {
        int mark = 85;
        // Use if condition to compute the grade
        if (mark < 60) {
            System.out.println("Grade : F");
        } else if (mark < 70) {
            System.out.println("Grade : D");
        } else if (mark < 80) {
            System.out.println("Grade : C");
        } else if (mark < 90) {
            System.out.println("Grade : B");
        } else if (mark <= 100) {
            System.out.println("Grade : A");
        }
    }

    /*
     * for (initialization; loopWhileTrue; executeAtBottomOfEachLoop) {
     * statementsToExecute }
     */

    static void ForLoopStars() {
        //int numRows = 10;

        // Printing the 'numRows' rows
        for (int currentRow = 1; currentRow <= 4; currentRow++) {
            // * is appended to the initiable stars for every iteration
            String stars = "";

            // The number of stars in each row is same the the row number
            for (int numStars = 1; numStars <= currentRow; numStars++) {
                stars = stars + '*';
            }

            // to print new line
            System.out.println(stars);
        }
    }

    static void whileloop() {
        int n = 1;
        while (n <= 10) {
            System.out.println(n);
            n = n + 1;
        }
    }

    static void Dowhileloop() {
        int n = 1;
        do {
            System.out.println(n);
            n = n + 1;
        } while (n <= 10);
    }

    static void MultiplicationTable(){
		int num = 5;
		// numRows specifies the number of rows in the multiplication table
		int numRows = 10;
		int result;
		// Run the loop from 0 to numRows
		for (int currentRow = 0; currentRow <= numRows ; currentRow++) {
			// Print the result in a below format.
			// 5 * 1 = 5
			// 5 * 2 = 10
          	result = num*currentRow;
			System.out.println( num + " * " + currentRow + " = " + (result));
		}
		
    } 

    static void  WhilMultiples(){
        int maxNum = 100;

		// Initially the sum is zero
		int sum = 0;
		int currentNum = 1;

		// While loop
		while (currentNum < maxNum) {
			// Check if currentNum is a multiple of both 3 and 5 in
			// below 'if' condition
			if (((currentNum % 3) == 0) && ((currentNum % 5) == 0)) {
				// If 'currentNum' is multiple of both 3 and 5 ,
				// then add it to 'sum'
				sum += currentNum;
			}
			currentNum++;
		}
		System.out.println("The sum of numbers that"
				+ " are multiples of 3 and 5 under " 
				+ maxNum + " is " + sum);
    }

    
    
    public static void main(String[] args) {
        System.out.println("\n\nWelcome back this is practice 2");
        //BooleanValues();
        //PositiveOrNegative();
        //compare_one();
        //RangeGrade();
        //ForLoopStars();
        //whileloop();
        //Dowhileloop();
        //MultiplicationTable();
        WhilMultiples();
    }

}