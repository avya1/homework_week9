/*
4. Write a Java program to create a new array list, add some colours (string) and
 printout the collection using for each loop
 */
package program4;
import java.util.ArrayList;
public class ColorArrayList {
    public static void main(String[] args) //main method
    {
        //static area
        ArrayList<String> color=new ArrayList<>();
        color.add("Red");
        color.add("Green");
        color.add("Blue");
        color.add("Yellow");
        color.add("White");
        color.add("Black");
        color.add("purple");
        //foreach loop to print arraylist
        for (String s: color)
        {
            System.out.print(s+" ");
        }
        
    }
}
