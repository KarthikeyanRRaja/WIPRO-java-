import java.lang.*;
import java.util.Scanner;
public class wip10 {
void cal(double r,double h){
	double pi=3.14;
	System.out.println("Volume="+((1.0/3.0)*(pi*r*r*h)));
	System.out.println("Surface Area="+(pi*r*(r+Math.sqrt(r*r+h*h))));
}
public static void main(String ar[])
{
	wip10 a=new wip10();
	double r,h;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Radius and height of the Cone=");
	r=s.nextDouble();
	h=s.nextDouble();
	a.cal(r, h);
}
}
