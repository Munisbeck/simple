package main;
import java.util.Scanner;

public class prostA {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
   System.out.println("This is calculator:");
   System.out.println("---------");
   System.out.println("|1 \t 2 \t 3|\n");
   System.out.println("|4 \t 5 \t 6|\n");
   System.out.println("|7 \t 8 \t 9|\n");
   System.out.println("|X \t 0 \t =|\n");
   System.out.println("|/ \t - \t +|\n");
   System.out.println("---------");
   System.out.println("Calculate?");
   System.out.println("First number :");
   int a = sc.nextInt();
   
   System.out.println("Second number:");
   int b = sc.nextInt();
   
   System.out.println("1. +");
   System.out.println("2. -");
   System.out.println("3. *");
   System.out.println("4. /");
   int operation = sc.nextInt();
   
switch (operation){
  case 1:
int sum = a + b;
  System.out.println("Value = "+sum);
  System.out.println("Calculate again");
break;
 case 2:
 int sub = a - b;
    System.out.println("Value = "+sub);
    System.out.println("Calculate again");
break;
 case 3:
 int mul = a * b;
    System.out.println("Value = "+mul);
    System.out.println("Calculate again");
break;
 case 4:
 double div = a / b;
    System.out.println("Value = "+div);
    System.out.println("Calculate again");
break;
default:
    System.out.println("check again");
    
}
  }


  }

