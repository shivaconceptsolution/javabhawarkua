package scs;
import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter number of students");
		size = sc.nextInt();
		Student obj[] = new Student[size];
		for(int i=0;i<obj.length;i++)
		{
			obj[i] = new Student();
			obj[i].accept();
		}
		
		for(int i=0;i<obj.length;i++)
		{
			obj[i].display();
		}
		
	}

}
