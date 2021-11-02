/*
3. Write a Java program to reverse an array of integer values
 */
package program3;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 7 number of your choice");
        int a[] = new int[7];
        int b[] = new int[7];
        //this for loop is for getting values from user
        for (int i = 0; i < 7; i++) {

            a[i] = sc.nextInt();

        }
        //for loop to print the entered number
        System.out.println("Given integer array is ");
        for (int i = 0; i < 7; i++) {
            System.out.print(a[i] + " ");
        }
        //for loop to reverse the entered number
        System.out.println();
        System.out.println("Reverse of the given array is  ");
        for (int i = 6; i >= 0; i--) {

            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}




