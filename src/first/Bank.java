package first;
import java.util.Scanner;
public class Bank {
  private int balance;
  private int pin;
  Scanner sc = new Scanner(System.in);
  Bank()
  {
	  balance=5000;
	  pin=1234;
  }
  private void credit(int amt)
  {
	  balance+=amt;
  }
  private void debit(int amt)
  {
	  balance-=amt;
  }
  private void checkBalance()
  {
	  System.out.println("Balance is "+balance);
  }
  private int enterAmount()
  {
	  System.out.println("Enter Amount");
	  return sc.nextInt();
  }
  public void login(int p) // data encapsulation
  {
	  if(pin==p)
	  {
		  
		  
		  credit(enterAmount());  //bind under login
		  debit(enterAmount());    // bind under login
		  checkBalance(); // bind under login
	  }
  }
}
