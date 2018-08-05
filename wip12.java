import java.util.*;
public class wip12 {
	public static void main(String ar[])
	{
		int n,i,fibb=0,fibb1=1,c;
		//int[] c=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N values=");
		n=s.nextInt();
		System.out.println("The Fibbonacci Series for"+n+"is");
		System.out.println(fibb);
		System.out.println(fibb1);
		
		for(i=1;i<=n;i++)
		{
			c=fibb+fibb1;
			fibb=fibb1;
			fibb1=c;
			System.out.println(c);
		}
		
		
		
	}

}
