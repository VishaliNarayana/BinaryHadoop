package kiran;

public class Reversenumber {
	 
    public static void main(String[] args) {
           
    	
    	
    	int[] a=new int[20];
    	a[0]=Integer.parseInt(args[0]);
    	a[1]=Integer.parseInt(args[1]);
    	System.out.println(a[0]);
    	System.out.println(a[1]);
    	int reversedNumber;
            int temp = 0,p=0;
          while(p<2) 
          {reversedNumber=0;
        	 int number=a[p];
            while(number > 0){
                   
                    //use modulus operator to strip off the last digit
                    temp = number%10;
                   
                    //create the reversed number
                    reversedNumber = reversedNumber * 10 + temp;
                    number = number/10;
                     
            }
           
p++;           
            System.out.println("Reversed Number is: " + reversedNumber);
    }
}}
