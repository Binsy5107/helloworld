package hello.world;
import java.util.Scanner;

public class AreaOfFigures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("select the option to find the area : ");
		System.out.println("a.circle");
		System.out.println("b.rectangle");
		System.out.println("c.sqaure");
		String choice=sc.next();
		choice=choice.toLowerCase();

		if (choice.equals("a"))
		{
		    System.out.println("enter the radius:");
		     double radius=sc.nextDouble();
			 double Area=3.14*radius*radius;
			 System.out.println("the area of the circle is " + Area);
		}
		else if  (choice.equals("b"))
		{
			
		    System.out.println("enter the length and breadth:");
		     int length=sc.nextInt();
			 int breadth=sc.nextInt();
			int Area=length*breadth;
			 System.out.println("the area of the rectangle is " + Area);
		}
		else if (choice.equals("c"))
		{
		    System.out.println("enter the length :");
		     int length=sc.nextInt();
			int Area=length*length;
			 System.out.println("the area of the square is " + Area);
		}
		

		
	}

}
