import java.util.*;
public class wip14 {
public static void main(String ar[])
{
	Scanner s=new Scanner(System.in);
	int n,num=0,i;
	int largestNumber=0;
	int[] a=new int[10];
	System.out.println("Enter the value=");
	n=s.nextInt();
	if((n/10)==0)
	{
		System.out.println("Please enter the value with atleast two digit or more");
	}
	else if(n>300)
	{
		System.out.println(n);
	}
	while( n != 0 )
    {
        num = num * 10;
        num = num + n%10;
        n = n/10;
    }
	System.out.println("The largest value is "+num);
}
}
