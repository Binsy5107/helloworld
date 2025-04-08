package hello.world;
import java.util.Scanner;

public class Grade {
	int english,maths,physics,total;
	public Grade(int english,int maths,int physics)
	{
		this.english=english;
		this.maths=maths;
		this.physics=physics;
	}
	public int Total()
	{
		int total= english+maths+physics;
		return total;
	}
	public String GradeCalculate(int total)
	{
		
			if(total>=270)
			return "A+";
			else if(total>=240)
			return "A";
			else if(total>=210)
				return "B+";
			else if(total>=180)
				return "B";
			else
				return "f";			
			}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("the amrks of first student:");
		System.out.println("enter the english mark:");
		int english1_1= sc.nextInt();
		System.out.println("enter the maths mark:");
		int maths1_2= sc.nextInt();
		System.out.println("enter the physics mark:");
		int physics1_3= sc.nextInt();
		Grade s1=new Grade(english1_1,maths1_2,physics1_3);
		
		System.out.println("the amrks of 2nd student:");
		System.out.println("enter the english mark:");
		int english2_1= sc.nextInt();
		System.out.println("enter the maths mark:");
		int maths2_2= sc.nextInt();
		System.out.println("enter the physics mark:");
		int physics2_3= sc.nextInt();
		Grade s2=new Grade(english2_1,maths2_2,physics2_3);
		int total1=s1.Total();
		int total2=s2.Total();
		String grade1=s1.GradeCalculate(total1);
		String grade2=s2.GradeCalculate(total2);

System.out.println("mark of 1st student: " + total1 + "grade is " + grade1);
System.out.println("mark of 2nd student: " + total2 + "grade is " + grade2);
}
}
