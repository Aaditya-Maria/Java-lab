import java.lang.*;
import java.util.Scanner;

public class Pattern{
public static void main(String[]args){
Scanner s = new Scanner(System.in);
System.out.println("Enter no. of rows");
    int n = s.nextInt();
    int i = 1;
    int k = 1;
       while(i <= n){
       int j =1;
       while ( j <= i){
       System.out.print(k+" ");
       k++;
       j++;
       }
      System.out.println();
      i++;
      }
}
}