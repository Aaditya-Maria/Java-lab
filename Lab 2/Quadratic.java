import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

public class Quadratic{
public static void main(String[]args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the values of a, b amd c");
int a,b,c;
a = s.nextInt();
b = s.nextInt();
c = s.nextInt();
int det = b*b-4*a*c;
double r1,r2;
 if(det > 0){
   r1 = (-b + Math.sqrt(det))/(2*a);
   r2 = (-b - Math.sqrt(det))/(2*a);
   System.out.format("r1 = %.2f and r2 = %.2f", r1,r2);
   System.out.println("The roots are real and distinct");
}
 else if(det == 0){
    r1 = -b/(2*a);
    r2=r1;
    System.out.format("r1 = r2 = %.2f;" ,r1);
    System.out.println("The roots are real and distinct");
}
 else if(det < 0 ){ 
    double real = (-b/(2*a));
    double imaginary = Math.sqrt(-det)/(2*a);
    System.out.format("r1 = %.2f + %.2fi", real,imaginary); 
    System.out.format("\nr2 = %.2f - %.2fi",real,imaginary);
    System.out.println("The roots are imaginary");
}
}
}
