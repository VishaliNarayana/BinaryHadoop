package kiran;

public class rectangle {
	 
    public static void main(String[] args) {
           
            int width = Integer.parseInt(args[0]);
            int length = Integer.parseInt(args[1]);
                   
             int perimeter = 2 * (length + width);
           
            System.out.println("Perimeter of a rectangle is " + perimeter);
    }
           
}
