// import java.util.Scanner;

// class Phone {





//     public static void main(String [] arg) {
//         Scanner data = new Scanner(System.in);        
//         int phonebills[] = new int [12];
//         phonebills[12] = data.nextInt();
//         int sum = 0;
//         int i;

//         for (i = 0; i < 12; i++){
//             System.out.println((i+1)+"=>$");
//             data.nextInt();
//         }






//     }




// }






import java.util.Scanner;

class Phone {





    public static void main(String [] arg) {
        Scanner scan = new Scanner(System.in);        
        int phonebills[] = new int [12];
        //phonebills[12] = data.nextInt();
        float sum = 0, average; 
        int i;

        for ( i = 0; i < 12; i++){
           System.out.print((i+1)+"=>$");
           phonebills[i]= scan.nextInt();
        }
        //System.out.println(phonebills[i]); 
        for( i = 0; i < 12; i++){
            sum += phonebills[i];
        }

        average = sum / (float) 12;
        System.out.println("\nYour average phonebill for 12 months is $"+average);
    scan.close();
    }



}













/*class oop {

    static void sayHello() {
        System.out.println("Hello World!");
    }

    public static void main(String[ ] args) {
        sayHello();
        sayHello();
        sayHello();
    }

}*/
/*
 class oop {
 
  
    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[ ] args) {
        sayHello("David");
        sayHello("Amy");
    }
*/