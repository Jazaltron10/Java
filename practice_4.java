
import java.net.MalformedURLException;
import java.net.URL;


public class practice_4 {


    static void Exception(){
        try {
			int number1 = 200;
			int number2 = 0;
			int result = number1 / number2;
			System.out.println("The result of " + number1 + " divided by "
					+ number2 + " is " + result);
		} catch (ArithmeticException ex) {
			System.out.println("Exception : Cannot be divided by zero");
		}
    }

    public static void main(String[] args) throws MalformedURLException {
            URL url = new URL("http://www.google.com");
            System.out.println("Protocol used is " + url.getProtocol());
        
        System.out.println("\nWelcome back, this is practice_4");
        Exception();
    }

}