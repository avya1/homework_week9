/*
10. Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name.
 */
package program10;
import java.util.HashMap;
import java.util.Scanner;
public class CheckStations {

    public static void main(String[] args) {
        HashMap<String,String> station=new HashMap<>();
        station.put("westminster","District   circle  and  jubilee line");
        station.put("warren street","Northern  and  victoria line ");
        station.put("vauxhall","Overground   and  victoria line ");
        station.put("victoria","National Rail ,District ,circle and victoria line");
        station.put("waterloo","Waterloo & city ,bakerloo,northern,jubilee");
        station.put("tottenham court road","Central and northern line");
        station.put("st pauls","Central line");
        station.put("regents park","Bakerloo line");
        station.put("pimlico","Victoria line");
        station.put("piccadily circus","Bakerloo and piccadilly line");
        station.put("paddington","Hammersmith & city and circle line");
        station.put("oxford circus","Central, bakerloo and victoria line");
        station.put("notting hill gate ","District ,central  and circle line");
        station.put("nine elms ","Northern line");
        station.put("london bridge","Northern and jubilee line ");
        station.put("liverpool street","Metropolitan ,central, circle and Hammersmith & city line ");
        station.put("leicester square ","Piccadilly and northern line");
        station.put("kings cross st pancras  ","Metropolitan ,northern, piccadilly,circle,victoria and hammersmith & city");
        station.put("euston","Northen ,Victoria,national Rail and overground");
        station.put("charring cross","bakerloo ,northern and national rail");
        station.put("bond street","Central and jubilee line");
        station.put("bank","Waterloo & city ,northern and central line");
        station.put("aldgate","Metropolitan and circle line ");
        station.put("angle","Northern line ");
        System.out.println("Enter any zone 1 tube station to find out lines details");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine().toLowerCase();//this take station name from user in lower case
        if(station.containsKey(s))//if to check hashmap contains that station or not
        System.out.println(station.get(s));
        else
            System.out.println("Station is temporary closed");

        scanner.close();


    }


}
