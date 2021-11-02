/*
5. Write a Java program to iterate through all elements in an array
list using Iterator.
 */
package program5;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UseOfIterator {
    public static void main(String[] args) //main method
    {
        AbstractList<Integer> number=new ArrayList<>();
        System.out.println("Enter 5 number in array list");
        Scanner sc=new Scanner(System.in);
        //for loop to take number from user in array list
        for (int i = 0; i < 5; i++) {
           number.add(sc.nextInt());
        }
        //iterator to print values
        Iterator i= number.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");

        }
        sc.close();

    }
}
