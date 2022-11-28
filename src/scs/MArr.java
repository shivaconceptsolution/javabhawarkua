package scs;
import java.util.*;
public class MArr {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);	
	  int r,c;
	  System.out.println("Enter rows and columns");
	  r = sc.nextInt();
	  c = sc.nextInt();
	  int arr[][] = new  int[r][c];
	  
	  for(int i=0;i<r;i++)
	  {
		  for(int j=0;j<c;j++)
		  {
			  System.out.println("Enter element for "+i+j+"index");
			  arr[i][j] = sc.nextInt();
		  }
		  System.out.println();
	  }
	  
	  for(int i=0;i<2;i++)
	  {
		  for(int j=0;j<2;j++)
		  {
			  System.out.print(arr[i][j] + " ");
		  }
		  System.out.println();
	  }

	}

}
 