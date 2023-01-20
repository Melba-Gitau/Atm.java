import java.util.*;
public class Main
{  int pin =2000;
    double balance = 0;
    public boolean deposit(double amount){
        if(amount > 0){
            balance += amount;
            return true;
        }else{
            return false;
        }
    }
    public boolean withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -=amount;
            return true;
        }else{
            return false;
        }
    }
    public double balance(){
        return balance;
    }
    public boolean changepin( ){
      //  int pin = 0;
     System.out.println("Enter new pin:");
     Scanner scan=new Scanner(System.in);
     int pin= scan.nextInt();
     this.pin =pin; 
     return true;
     
        
    }
    public boolean isAuthentic(){
      
    
       int trials=0;
        do{
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter pin to continue");
                int newPin=scan.nextInt();
                if(pin==newPin){
                    return true;
                }
                else{
                    System.out.println("Wrong pin try again!!");
                    trials++;
                    
                }
                
        }
        while(trials<3);
        
        return false;
    }
	    public void menu(){
	    System.out.println("_____________________________");
		System.out.println("Welcome to our system.");
		System.out.println("Select option: ");
		System.out.println("........................");
		System.out.println("1.Deposit        2.Withdraw");
		System.out.println("3.Balance        4.Change pin");
	    System.out.println("_____________________________");
	    System.out.println("1,2,3,4");
	    
	   Scanner scanner = new Scanner(System.in);
	   int opt = scanner.nextInt();
	   switch (opt){
		    case 1:
		    System.out.println("Enter amount to deposit");
		    double amount = scanner.nextDouble();
		    if( isAuthentic()){
		         if(deposit(amount)){
		             System.out.println("Deposited successfully!");
		         }else{
		             System.out.println("Deposit failed");
		         }
		         
		    }
		    else{
		        System.out.println("Access denied!!!");
		    }
		   
		    menu();
		    break;
		 case 2:
		    System.out.println("Enter amount to withdraw");
		    double withdraw = scanner.nextDouble();
		       if( isAuthentic()){
		           if(withdraw(withdraw)){
		             System.out.println("Withdraw successful!");
		         }else{
		             System.out.println("Withdraw failed");
		         }
		       
		    }
		    else{
		        System.out.println("Access denied!!!");
		    }
		     menu();
		     break;
		 case 3:
		     if(isAuthentic()){
		             System.out.println("Your balance is " + balance());
		         }else{
		             System.out.println("Failed");
		         }
		     menu();
		     break;
		 case 4:
		  //  System.out.println("Enter current pin ");
		  //  int pin = scanner.nextInt();
		   if(isAuthentic()){
		   if(changepin()){
		        System.out.println("Pin changed successfully! "); 
		   }
		   else{
		         System.out.println("Failed !!\nContact customer care 072222222\nfor help " );
		   }
		     }
		    menu();
		     break;
		default:
		  System.out.println("Invalid option!");
	   }
	    }
	public static void main(String[] args) {
	    Main main=new Main();
	    main.menu();
		      //System.out.println("Thank you for your time.");
		  }
}