package kiran;

public class pyramidform {
    
    public static void main (String[] args) throws Exception{
           
            int as= Integer.parseInt (args[0]);
            int x=   Integer.parseInt (args[1]);
             
            int y = 0;
           
            for(int i=0; i<= as ;i++){
                   
                    for(int j=1; j <= i ; j++){
                            System.out.print(y + "\t");
                            y = y + x;
                    }
                   
                    System.out.println("");
            }
    }
}
/*This Java example shows how to generate a pyramid of numbers for given
number using for loop example*/