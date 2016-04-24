package kiran;
import java.io.*;
import java.util.Scanner;
public class factorial {
	 
    public static void main(String[] args) {
                 
            int factorial = Integer.parseInt(args[0]);
            int n=factorial;
          
           
            for(int i =(n - 1); i > 1; i--)
            {
                    factorial = factorial * i;
            }
   
            System.out.println("Factorial of a number is " + factorial);
    }
}