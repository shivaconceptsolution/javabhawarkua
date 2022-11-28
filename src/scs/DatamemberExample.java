package scs;

public class DatamemberExample {
static int x;
int y;
static void fun()  // static method
{
	x=100;
	System.out.println(x);
}

void fun1()  // instance,dynamic method
{
	y=200;
	System.out.println(y);
}

public static void main(String args[])
{
	DatamemberExample.fun();
	DatamemberExample obj = new DatamemberExample();
	obj.fun1();
	
}
}
