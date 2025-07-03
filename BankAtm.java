import java.util.Scanner;
abstract class holder{
    String name;
    float bal;
    holder(String name,float bal){
        this.name=name;
        this.bal=bal;
    }
    public abstract void displaybal();
}
    interface AtmOps{
    void withdraw(double withdrawl_amnt);
    void deposit(double deposit_amnt);

 }
 class CurrentAcc extends holder implements AtmOps {
    Scanner sc=new Scanner(System.in);
    CurrentAcc(String name,float bal){
        super(name,bal);
    }
    
    public void withdraw(double withdrawl_amnt){
        if(bal>=withdrawl_amnt){
            System.out.println("WITH DRAWL SUCCESS ! ");
            bal-=withdrawl_amnt;
        }else{
            System.out.print(" INSUFICENTE BALENCE ");
            System.out.print(" deposit some money : ");
            double deposit_amnt=sc.nextDouble();
            deposit(deposit_amnt);

        }
    }
    public void deposit(double deposit_amnt){
          bal+=deposit_amnt;
          System.out.println(" The amount "+deposit_amnt+"is deposited succesfull ");
    }
    public void displaybal(){
             System.out.print(" CURRENT ACCOUNT BALANCE IS : "+bal);
    }
        
    
 }
    

public class BankAtm {
    public static void main(String []args){
        CurrentAcc c=new CurrentAcc("siva",15000);
        Scanner sc=new  Scanner(System.in);
        System.out.println(" WELCOME TO THE BANK ATM  "+ c.name);
        System.out.println(" please insert your card into ATM !!!!");
        while(true){
        System.out.println(" CHOOSE OPERTION \n 1.WITH DRAWL \n 2.DEPOSIT \n 3.CHECK BALENCE \n 4.REMOVE CARD  ");
        int choice =sc.nextInt();
       switch(choice){
             case 1: 
                   System.out.print(" ENTER MONEY TO WITHDRAL  :  ");
                    double withdrawl_amnt=sc.nextDouble();
                    c.withdraw(withdrawl_amnt);
                    break;
            case 2: 
                  System.out.print("ENTER MONEY TO DEPOSIT :  ");
                  double deposit_amnt =sc.nextDouble();
                  c.deposit(deposit_amnt);
                  break;
            case 3: 
                   c.displaybal();
                   break;
            case 4: 
                  System.out.println("Removing card.........");
                  System.out.println(" Transition cacelled sucessfully");
                  sc.close();
                  System.exit(0);
            case 5: 
                  System.out.println(" Invalid operation !!!");
       }

       }
    }
}
