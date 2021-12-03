import java.util.Scanner;
abstract class shape{
  double a,b;
  abstract void printarea();
}

class rectangle extends shape{
  void getdata(double x, double y){
      a=x;
      b=y;
    }
   
    void printarea(){
       System.out.println("Area of rectangle is" +(a*b));
    }
}

class triangle extends shape{
  void getdata(double x, double y){
      a=x;
      b=y;
    }

void printarea(){
       double area=0.5*a*b;
       System.out.println("Area of triangle is" +area);
    }
}

class circle extends shape{
  void getdata(double x){
      a=x;
    }
void printarea(){
       double area=3.14*a*a;
       System.out.println("Area of circle is" +area);
    }
}

public class Areas{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int ch;
        shape si;
        rectangle r=new rectangle();
        triangle t=new triangle();
        circle c=new circle();
        System.out.println("\nEnter your choice\n1.Rectangle \n2.Triangle \n3.Circle");
        ch=scan.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("Enter length and breadth");
                double l=scan.nextDouble();
                double b=scan.nextDouble();
                r.getdata(l,b);
                r.printarea();
                break;
           
            case 2:
                System.out.println("Enter base and height");
                double b1=scan.nextDouble();
                double h=scan.nextDouble();
                t.getdata(b1,h);
                t.printarea();
                break;
           
            case 3:
                System.out.println("Enter radius");
                double r1=scan.nextDouble();
                c.getdata(r1);
                c.printarea();
                break;
            default:
                System.out.println("Invalid choice");

        }
       
    }
}