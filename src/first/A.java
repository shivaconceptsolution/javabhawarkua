package first;

public class A {
	int a;  // global variable
    void fun1()
    {
    	int a;  // local variable
    	System.out.println("Default");
    }
    private void fun2()
    {
    	
    	System.out.println("Private");
    }
    protected void fun3()
    {
    	fun2();
    	System.out.println("Protected");
    }
    public void fun4()
    {
    	System.out.println("Public");
    }
    public static void main(String args[])
    {
    	A obj = new A();
    	obj.fun1();
    	obj.fun2();
    	obj.fun3();
    	obj.fun4();
    }
}
