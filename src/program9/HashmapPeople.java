/*
9. Create a HashMap object called people that will store String keys and Integer values:
And use for each loop to iterate the value from Map.
 */
package program9;
import java.util.HashMap;
public class HashmapPeople {
    public static void main(String[] args)// main method
    {
        //static area
        HashMap<String,Integer> people=new HashMap<>();
        people.put("London",20);
        people.put("Indore",50);
        people.put("Ahmedabad",28);
        people.put("Bhopal",60);
        people.put("Raipur",70);
        //foreach loop
        for (Integer i: people.values())
              {
                  System.out.println(i);
        }



    }
}
