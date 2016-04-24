package kiran;

import java.util.Scanner;
 
public class circlearea {
 
        public static void main(String[] args) {
        	   
               int radius = Integer.parseInt(args[0]);
               
                	
               
                                double area = Math.PI * radius * radius;
               
                System.out.println("Area of a circle is " + area);
        }
}
