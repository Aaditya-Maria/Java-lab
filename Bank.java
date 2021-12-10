import java.util.Scanner;
import java.lang.Math;
class bank{
    String name;
    int Acc_no;
    float bal,si;
    Scanner s = new Scanner(System.in);
    void accept(){
        System.out.println("Enter the name of the user");
        name = s.nextLine();
        System.out.println("Enter the account number");
        Acc_no = s.nextInt();
        System.out.println("Enter the account balance");
        bal = s.nextFloat();
    
    void display(){
        System.out.println();
        System.out.println("Enter the account details")
        System.out.println("Name:"+name+"Account number"+Acc_no+"Account balance"+bal+);
    } 
    
    void deposit(){
        System.out.println();
        System.out.println("Do you want to deposit money");
        System.out.println("Press 1 for YES and 2 for NO");
        int d = s.nextInt();
        if(d==1){
            System.out.println("Enter the amont to be deposited");
            float amt = s.nextFloat();
            bal = bal + amt;
            System.out.println("Available Balance"+bal);
        }

    }


    }
}
class current extends bank{
    float service_charge = 100;
     Scanner s = new Scanner(System.in);
    void cheque(){
        System.out.println("Cheque service available");

    }
    void simple_interest(){
        System.out.println();
        System.out.println("Enter the rate of interest");
        float r = s.nextFloat();
        System.out.println("Enter the number of times interest  applied per time period");
        int n = s.nextInt();
        System.out.println("Enter the time elapse");
        int t = s.nextInt();
        si =(bal*(1+r/n)); 
        System.out.println("Simple interest = Rs"+(Math.pow(si, n*t)));
    }

    void withdrawl(){
        System.out.println();
        System.out.println("Mininmum account balance = Rs.1000");
        System.out.println("Enter the amount to withdraw");
        float amount = s.nextFloat();
        if(amount<bal){
            System.out.println("Balance is insufficient");
            else{
                bal = bal - amount;
                if(bal<amount){
                    System.out.println("Min balance is inufficient");
                    bal = bal - service_charge;
                    System.out.println("Your account has been charged for not keeping the minimum balance");
                    System.out.println("Amount deducted :"+service_charge);
                    System.out.println("Available balance"+bal);


                }

            }
        }
    }

}
public class Main{
    public static void main(String[]args){
        savings.obj = new savings;
        current.obj2 = new current;
        int choice;
        System.out.println();
        System.out.println("Enter your choice");
        System.out.println("1.Savings\n2.Current");
        Scanner s = new Scanner(System.in);
         choice = s.nextInt();
         switch(choice){
             case 1 : obj1 = new savings();
                      obj1.accept();
                      obj1.display();
                      obj1.cheque();
                      obj1.deposit();
                      obj1.withdraw();

             case 2 : obj2 = new savings();
                      obj2.accept();
                      obj2.display();
                      obj2.cheque();
                      obj2.deposit();
                      obj2.withdraw();
                      

             default :
             System.out.println("You have entered a wrong choice");       
                    }        
    }
}