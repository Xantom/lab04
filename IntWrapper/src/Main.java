
import java.io.*;
import java.util.Scanner;

public class Main {

  

        
          public static void  main(String[] args){
              int num;
              Scanner scan = new Scanner(System.in);
              
              System.out.println("Enter an Integer");
              num = scan.nextInt();
              
              System.out.println("Number entered: " + num);
              System.out.println("Binary: " + Integer.toBinaryString(num));
              System.out.println("Hexadecimal: " + Integer.toHexString(num));
              System.out.println("Octal: " + Integer.toOctalString(num));
              
              System.out.println("Maximum possible integer value: " + Integer.MAX_VALUE );
              System.out.println("Minimum possible integer value: " + Integer.MIN_VALUE );
              
              System.out.println("Enter 2 integers ");
              String int1 = scan.next();
              String int2 = scan.next();
              
              int i1 = Integer.parseInt(int1);
              int i2 = Integer.parseInt(int2);
              
             System.out.println("The sum of these two integers: " + (i1 + i2)); 
  
  
    }
}



