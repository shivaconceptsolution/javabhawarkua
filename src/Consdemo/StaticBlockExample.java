package Consdemo;

public class StaticBlockExample {
   static int x,y;
   static
   {
	   x=100;
	   y=200;
	   System.out.println(x+y);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");

	}

}
