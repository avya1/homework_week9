/*
6. Write a Java program to retrieve an element (at a specified index)
from a given array list
 */

package program6;

import java.util.ArrayList;
import java.util.Scanner;

public class RetrieveFromArrayList {
    public static void main(String[] args)//main method
    {
        ArrayList<Integer> i=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers ");
        //for loop to get numbers from user
        for (int j = 0; j < 5; j++) {
         i.add(sc.nextInt());
        }
        System.out.println("Enter index number to get relevant number ");
        int n= sc.nextInt();
        if(n>=0&&n<=4) {
            System.out.println("Requested index  is " + n + " and number at that index is ");
            System.out.println(i.get(n));//get method to get value from specific index
        }else {
            System.out.println("Please enter index value between 0 to 4");
        }
        sc.close();


    }
}
