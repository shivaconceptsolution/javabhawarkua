package scs;
import java.util.Scanner;
public class JaggedArrayExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r,c;
		System.out.println("Enter row");
		r = sc.nextInt();
		int arr[][] = new int[r][];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter column");
			c = sc.nextInt();
			arr[i] = new int[c];
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter element for "+i+j+" index");
				arr[i][j]=sc.nextInt();
			}
		
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
