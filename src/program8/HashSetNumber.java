/*
8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 Show which numbers are between 1 and 10 are in the set.
 (Hint: use for loop and if else)
 */
package program8;

import java.util.HashSet;

public class HashSetNumber {
    public static void main(String[] args)//main method
    {
        //static area
        HashSet<Integer> i = new HashSet<>();
        i.add(4);
        i.add(7);
        i.add(8);
        for (int j = 1; j <= 10; j++) {
            if (i.contains(j)) //contains() to check set holds the particular value or not
            {
                System.out.println("Numbers " + j + " is in set which is between 1 to 10");
            }
        }

    }}

