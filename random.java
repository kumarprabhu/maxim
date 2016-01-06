package jobspire;

import java.util.*;

public class random 
{
     public static void func(String name)
     {
         Random r = new Random();
    	 
    	 System.out.println(name+"\t"+(r.nextInt(10)+6));
    	 
    	    	 
     }
     public static void main(String args[])
     {
    	 String name;
    	 Scanner s = new Scanner(System.in);
    	 System.out.println("Enter the name");
    	 name = s.nextLine();
    	 func(name);
    	
    	 
     }
}
