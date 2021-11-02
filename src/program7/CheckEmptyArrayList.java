/*
7. Write a Java program to test an array list is empty or not.
 Define array list with underground tube names
 */
package program7;

import java.util.ArrayList;

public class CheckEmptyArrayList {
    public static void main(String[] args)//main method
    {
        //static area
        ArrayList<String > s=new ArrayList<>();
        s.add("Bakerloo Line");
        s.add("Central line");
        s.add("Circle line ");
        s.add("District Line");
        s.add("Hammersmith & City line");
        s.add("Jubilee line");
        s.add("Metropolitan line");
        s.add("Northern line");
        s.add("Victoria line");
       boolean ans=s.isEmpty();//isEmpty() method is used to check array list is empty or not it returns boolean value
       if(ans==true){
           System.out.println("Array List is Empty");
       }
       else
       {
           System.out.println("Array List is not Empty .Element of Array List are");
           System.out.println(s);
       }
    }

}
