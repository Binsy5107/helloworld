package hello.world;


public class Palindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s ="Malayalam";
		String rev="";
		int i;
		s=s.toLowerCase();
		for (i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);

		}	
		
		if (s.equals(rev))
		{
			System.out.println("the string is palindrome");
		}
		else 
		{
			System.out.println("the string is not palindrome");
		}
		
	}

}
