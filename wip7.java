import java.util.*;
public class wip7 {
	void less(int arr[]) {
		int less=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			less=(arr[i]>arr[i+1])?arr[i+1]:arr[i];
		}
		if(less>0) {System.out.println("Least="+(less-1));}
		else {System.out.println("Least="+0);}
	}
	public static void main(String args[]) {
		wip7 num=new wip7();
		int i,n=5;
		int b[]=new int[n];
		Scanner s=new Scanner(System.in);
		for(i=0;i<n;i++)
		{b[i]=s.nextInt();
		num.less(b);
	}
	}

}
