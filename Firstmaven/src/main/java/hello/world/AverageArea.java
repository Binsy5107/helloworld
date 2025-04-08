package hello.world;
import java.util.Scanner;
public class AverageArea {
	int a,b,c;
	float d,e,f;
public void Average(int a,int b,int c)
{
	this.a=a;
	this.b=b;
	this.c=c;
	int sum=a+b+c;
	int avg=sum/3;
	System.out.println("the avg of the int numbers is " +avg);
}
public void Average(float d,float e, float f)
{
	this.d=d;
	this.e=e;
	this.f=f;
	float sum=d+e+f;
	float avg=sum/3;
	System.out.println("the avg of the int numbers is " +avg);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a,b,c;
        float d,e,f;
System.out.println("enter the 3 int numbers:");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
AverageArea intavg=new AverageArea();
intavg.Average(a,b,c);

System.out.println("enter the 3 float numbers:");
d=sc.nextFloat();
e=sc.nextFloat();
f=sc.nextFloat();
AverageArea floatavg=new AverageArea();
floatavg.Average(d,e,f);
			
		
		
	}

}
