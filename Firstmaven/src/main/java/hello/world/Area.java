package hello.world;


public class Area {
	
public static void Areas(double r)
{
	
	double area=3.14*r*r;
	System.out.println("arae of the circle is " + area);
}
public static void Areas(int length,int breadth)
{
	
	int area= length*breadth;
	System.out.println("arae of the rectangle is " + area);
}
public static void Areas(int side)
{
	
	int area= side*side;
	System.out.println("arae of the square is " + area);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area.Areas(12.45);
		Area.Areas(17,14);
		Area.Areas(18);	
		
	}

}
