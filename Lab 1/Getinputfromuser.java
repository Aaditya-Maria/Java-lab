import java.util.Scanner;
public class Getinputfromuser{
public static void main (String[]args){
     
     int a;
     float b;
     String s;

 Scanner in = new Scanner (System.in);
  System.out.println("Enter an integer");
       a = in.nextInt();
  System.out.println("You entered integer" + a);
    
 System.out.println("Enter a float");
       b = in.nextFloat();
 System.out.println("You entered a float" + b);

 System.out.println("Enter a String");
       s = in.nextLine();
 System.out.println("You entered a String" +s);
 }
 }