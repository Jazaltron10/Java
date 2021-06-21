import java.util.Scanner;


public class Hello{
	
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("This is Simply a very basic Java program \n");
        System.out.println(2+2);
		//String First_Name,Last_Name;
		System.out.println("Please Input your FirstName and LastName respectively ");
		Scanner First = new Scanner (System.in);
		Scanner Last_Name = new Scanner (System.in);
		//First.close();
		//Last_Name.close ();

		System.out.println("Hello Welcome " + First.nextLine() + " " + Last_Name.nextLine());
		System.out.println("This Just Feels really Good");
		
		
		//String name = "david";
		int age = 42;
		//double score = 15.6;
		
		System.out.println("Hello world " + age );

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Input the value of 3 integers respectively");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
		//scan.close();
		
        System.out.println("Integer 1 -> " + a);
        System.out.println("Integer 2 -> " + b);
        System.out.println("Integer 3 -> " + c);
		

		System.out.println("Even/Odd -> Please Input the value of your integer");
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		//scanner.close();
		
		
		//If n is odd, print Weird
		if ( n % 2 == 1){
			System.out.println("Weird");
		}
		//If n is even and in the inclusive range of 2 to 5, print Not Weird
		else if (n % 2 == 0  && ( n >= 2 && n <= 5 )){
				System.out.println("Not Weird");
		}
		
		//If n is even and in the inclusive range of 6 to 20, print Weird
		else if (n % 2 == 0  && (n >= 6 && n <= 20)){
			System.out.println("Weird");
		}
	
		//If n is even and greater than 20, print Not Weird
		else if (n % 2 == 0  && (n > 20)){
			System.out.println("Not Weird");
		}
		else {
			System.out.println("Number is out of bounds");
		}
		



		
    }
}