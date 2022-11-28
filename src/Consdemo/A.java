package Consdemo;

public class A {
int a=1,b=2;

static
{
	System.out.println("Static Block");
}
A()
{
	System.out.println("Constructor");
	System.out.println(a+b);
}

public static void main(String args[])
{
	System.out.println("Main Method");
	A obj = new A();
	
}

{
	System.out.println("Initializer");
	a=100;
	b=200;
}
}
