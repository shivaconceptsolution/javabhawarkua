package scs;
import java.util.Scanner;
public class Student {
    int rno;
    String sname;
    Scanner sc = new Scanner(System.in);
    void accept()
    {
    	System.out.println("Enter rno");
    	rno = sc.nextInt();
    	System.out.println("Enter name");
    	sname = sc.next();
    }
    void display()
    {
    	System.out.println("rno is "+rno);
    	System.out.println("name is "+sname);
    }
}
