import java.util.Scanner; 

public class OOP {
    
    class Myclass{
        void sayHello(String name ){
        System.out.println("Hello " + name );
        }
    }

    
    static int sum_return (int val_1,int val_2){
        return val_1 + val_2;
    }
    
    static int Max(int a, int b){
        if (a > b){
            System.out.print(a +" is greater than " + b);
            return a;
        }
        else{
            System.out.print(b +" is greater than " + a);
            return b;
        }

    }
    

    static void printarea( width.nextInt() , height.nextInt()){
         width.nextInt() * height.nextInt() ;
    }
    public static void main(String [] args) {
        //System.out.println("Hello OOP");
        OOP x = new OOP();
        
       /* 
        Myclass level1 = x.new Myclass();
        level1.sayHello("David");
        level1.sayHello("Amy");
        
        int xo = sum_return(2,5);
        System.out.println(xo);
        
        int res = Max(85,45);
        System.out.println("\nTherefore the greater number is:-> "+ res);
    
        int area = printarea(2, 5);
        System.out.println("\nThe Area of the rectangle is:-> "+ area);
*/

        Scanner read = new Scanner(System.in);
        int width = read.nextInt();
        int height = read.nextInt();
        int printarea(width, height);

        S.close();
    }

    //}

}