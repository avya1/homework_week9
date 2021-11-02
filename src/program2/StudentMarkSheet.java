/*
2. Re write the student mark sheet programme using if else and while loop.
 */
package program2;

import java.util.Scanner;

public class StudentMarkSheet {
    int total = 300;
    float per,got;
    String result,grade;
    public void getDetails(String name,int rn,int m, int s, int e) {
        got = m + s + e;//equation to get total obtain marks by student
        per = got / total * 100;//equation to get percentage

            if(m<35||s<35||e<35){
                result="Fail";
                grade=" ";
            }else
            {
                result="Pass";
            }
            //this nested if else is to give grade of student
            if ( per >= 80) {
                grade = "A+";

            } else if ( per >= 60) {
                grade = "A";

            } else if ( per >= 50) {
                grade = "B";

            } else if (per >= 35) {
                grade= "C";

            }


            //print statement is to print market sheet  in proper format
            System.out.println("---------------------------------");
            System.out.println("|                                |");
            System.out.println("|           Mark Sheet           |");
            System.out.println("|--------------------------------|");
            System.out.println("|    Name      :  "+name+"            |");
            System.out.println("|    RollNo    :  "+rn+"              |");
            System.out.println("|--------------------------------|");
            System.out.println("|    Subject   :  Marks          |");
            System.out.println("|    Maths     :  "+m+"             |");
            System.out.println("|    Science   :  "+s+"             |");
            System.out.println("|    English   :  "+e+"             |");
            System.out.println("|--------------------------------|");
            System.out.println("|    Total     : "+got+"           |");
            System.out.println("|--------------------------------|");
            System.out.println("|    Percentage: "+per+"            |");
            System.out.println("|    Result    : "+result+"            |");
            System.out.println("|    Grade     :  "+grade+"             |");
            System.out.println("|                                |");
            System.out.println("----------------------------------");
        }// else {
           // System.out.println("Invalid Input, Marks should between 0 to 100");
        //}


    public static void main(String[] args) //main method
    {
        //static area
        System.out.println("Enter student details:");
        Scanner sc = new Scanner(System.in);//object creation for Scanner class
        System.out.println("Name:");
        String name = sc.nextLine();//getting input with the help of Scanner class object
        System.out.println("Roll Number:");
        int rn = sc.nextInt();
        System.out.println("Marks in following Subjects =");
        System.out.println("Maths:");
        int m = sc.nextInt();
        while(!(m>=0&&m<=100)){
            System.out.println("Invalid marks entered");
            System.out.println("Please enter marks between 0 to 100 to continue");
            m = sc.nextInt();
        }
        System.out.println("Science:");
        int s = sc.nextInt();
        while(!(s>=0&&s<=100)){
            System.out.println("Invalid marks entered");
            System.out.println("Please enter marks between 0 to 100 to continue");
             s = sc.nextInt();
        }
        System.out.println("English:");
        int e = sc.nextInt();
        while(!(e>=0 && e<=100) ){
            System.out.println("Invalid marks entered");
            System.out.println("Please enter marks between 0 to 100 to continue");
            e = sc.nextInt();
        }

        sc.close();
        StudentMarkSheet obj = new StudentMarkSheet();//object creation for the MarkSheet class
        obj.getDetails(name,rn,m, s, e);//calling instance method with the help of object

}}
