package Consdemo;

public class Student {
int rno;
String sname;
Student() //constructor
{
	rno=1001;
	sname="Manish kumar";
}

Student(int rno,String sname)  // parametrised 
{
	this.rno = rno;
	this.sname = sname;
}
Student(Student s)  // parametrised class type
{
	this.rno = s.rno;
	this.sname = s.sname;
}
void display() //method
{
	System.out.println("rno is "+rno);
	System.out.println("Name is "+sname);
}
public static void main(String args[])
{
	Student obj = new Student();
	obj.display();
	Student obj1 = new Student(1002,"xyz");
	obj1.display();
	Student obj2 = new Student(obj);  // obj2 = obj
	obj2.display();
}
}
