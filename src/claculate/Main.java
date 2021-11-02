/*
1. Write a java program using the following descriptions
1. Create one package with name calculate
2. Create two class with name “Calculator” and “Main”
3. Create four methods with manes “addition”, “subtraction”, “division”, and
 “multiplication”. All methods are instance method and it doesn’t return anything.
 But it has two parameters with name “int a” and “int b”. Also each method have
  System.out.println(). This prints the result. Also create all one more method with
  name “calculateResult” with three parameter with name int a, int b and char symbol.
   Write the logic in calculateResult method that when user enter first number and
   second number and symbol based on symbol it does calculate.
4. Write a “main” method into main class. It has scanner that takes user input.
 Also write the logic that it ask user to
  “Enter first Number:”, “Enter second Number:” “Please enter one of symbol +,-,*, /:”
  if user enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
  other symbol.
5. With the result it’s also print one more message “Would you like to do
more calculation Please enter “Y” or “N” :” (Hint use while loop if user enter
Y program asking the user to enter First Number, and if user enter N programme should
 terminate)
 */
package claculate;
import claculate.Calculator;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) //main method
    {

        Calculator obj = new Calculator();
        System.out.println("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Please enter one symbol +,-,*,/:");
        char c = sc.next().charAt(0);
        obj.calculateResult(a, b, c);
        System.out.println("Would you like to do more calculation please enter Y or N ");
        char c1 = sc.next().charAt(0);
//this while loop is for asking user to continue
            while (c1 == 'y') {
                System.out.println("Enter first number: ");
                int k = sc.nextInt();
                System.out.println("Enter second number");
                int l = sc.nextInt();
                System.out.println("Please enter one symbol +,-,*,/:");
                char m = sc.next().charAt(0);
                obj.calculateResult(k, l, m);
                System.out.println("Would you like to do more calculation please enter Y or N ");
                char c2 = sc.next().charAt(0);

                if(c2=='Y'||c2=='y'){
                    c1='y';
                }else if(c2=='N'||c2=='n'){
                    break;
                }

            }sc.close();

        }


    }

