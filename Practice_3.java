import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class Practice_3 {

	static void WhilMulti() {
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
		System.out.println("\nThe sum of numbers that" + " are multiples of 3 and 5 under " + maxNum + " is " + sum);
	}

	static void john() {
		System.out.println("\nHello world");
	}

	static void ArrayIterate() {
		// Declare array
		String[] studentNames;
		// Initialize
		studentNames = new String[3];
		studentNames[0] = "John";
		studentNames[1] = "Linda";
		studentNames[2] = "Joe";
		// Iterate over the array
		for (int i = 0; i < studentNames.length; i++) {
			System.out.println("\n" + studentNames[i]);
		}
	}

	static void MultiDimensionalArray() {
		String[][] studentFullName = new String[3][3];

		studentFullName[0][0] = "James";
		studentFullName[0][1] = "Smith";

		studentFullName[1][0] = "Maria";
		studentFullName[1][1] = "Garcia";

		studentFullName[2][0] = "Michael";
		studentFullName[2][1] = "Johnson";

		// Printing all the first names.
		System.out.println("First names are:");
		for (int i = 0; i < studentFullName.length; i++) {
			System.out.println(studentFullName[i][0]);
		}

		// Printing all the last names.
		System.out.println("Last names are:");
		for (int i = 0; i < studentFullName.length; i++) {
			System.out.println(studentFullName[i][1]);
		}
	}

	static void ReverseArrayElements() {
		System.out.println("Declare and initialize an array");
		int var[] = new int[5];
		for (int i = 0; i < var.length; i++) {
			var[i] = i;
		}
		System.out.println(Arrays.toString(var));

		int reverseVar[] = new int[5];
		for (int i = 0; i < reverseVar.length; i++) {
			// Corresponding element form end in the var array
			reverseVar[i] = var[var.length - i - 1];
		}
		System.out.println(Arrays.toString(reverseVar));

		/*
		 * NOte this Integer boxedValue = Integer.valueOf(238); String characterNumeric
		 * = boxedValue.toString();
		 * 
		 * String characterNumeric = "238"; Integer convertedValue =
		 * Integer.parseInt(characterNumeric);
		 */

	}

	static void List_Demo() {
		/* Creation of ArrayList */
		ArrayList<String> studentNames = new ArrayList<>();

		/* This is how elements should be added to the array list */
		studentNames.add("Ajeet");
		studentNames.add("Harry");
		studentNames.add("Chaitanya");
		studentNames.add("Steve");
		studentNames.add("Anuj");

		/* Displaying array list elements */
		System.out.println("Currently the array list has following elements:" + studentNames);

		/* Add element at the given index */
		studentNames.add(0, "Rahul");
		studentNames.add(1, "Justin");

		/* Remove elements from array list like this */
		studentNames.remove("Chaitanya");
		studentNames.remove("Harry");

		System.out.println("Current array list is:" + studentNames);

		/* Remove element from the given index */
		studentNames.remove(1);

		System.out.println("Current array list is:" + studentNames);
	}

	static void List_demo_2() {

		ArrayList<Integer> studentMarks = new ArrayList<>();
		studentMarks.add(14);
		studentMarks.add(7);
		studentMarks.add(39);
		studentMarks.add(40);

		/* For Loop for iterating ArrayList */
		System.out.println("For Loop");
		for (int count = 0; count < studentMarks.size(); count++) {
			System.out.println(studentMarks.get(count));
			// count++;
		}
	}

	static void IteratorDemo() {

		ArrayList<String> studentNames = new ArrayList<>();
		studentNames.add("Chaitanya");
		studentNames.add("Steve");
		studentNames.add("Jack");
		Iterator it = studentNames.iterator();
		while (it.hasNext()) {
			String sutdentName = (String) it.next();
			System.out.println(sutdentName);
		}
	}



	static void MapDemo(){
		HashMap<Integer, String> studentIDandName = new HashMap<>();
		// Adding elements to HashMap
		studentIDandName.put(1, "David");
		studentIDandName.put(2, "Tim");
		studentIDandName.put(33, "David");
		studentIDandName.put(9, "Alice");
		studentIDandName.put(3, "Lynda");

		// FOR LOOP
		System.out.println("For Loop:");
		for (Map.Entry studentDetail : studentIDandName.entrySet()) {
			System.out.println("Key: " + studentDetail.getKey() + " & Value: "
					+ studentDetail.getValue());
		}
		// WHILE LOOP & ITERATOR
		System.out.println("While Loop:");
		Iterator iterator = studentIDandName.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry studentDetail = (Map.Entry) iterator.next();
			System.out.println("Key: " + studentDetail.getKey() + " & Value: "
					+ studentDetail.getValue());
		}
	
	}
	

	public static void main(String[] jazaltron) {
		// WhilMulti();
		// john();
		// ArrayIterate();
		// MultiDimensionalArray();
		// ReverseArrayElements();
		// List_Demo();
		List_demo_2();
		IteratorDemo();
		MapDemo();	
	}


}
