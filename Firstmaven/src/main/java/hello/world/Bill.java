package hello.world;

import java.util.Scanner;

public class Bill {
	private 
	double itemprices[];
	public Bill(double prices[])
	{
		itemprices=prices;
	}
	public class Discount {
		static double CheckTotalPrice(int n ,double itemprices[])
		{
			int i;
		double TotalPrice=0;
			for(i=0;i<=itemprices.length-1;i++)
			{
			
				TotalPrice=TotalPrice+itemprices[i];
				
			}
			return TotalPrice;
			
		}
		static double CheckDiscount(double TotalPrice)
		{
		 if (TotalPrice>=5000)
		 {
			 return TotalPrice*0.20;
		 }
		 else
		 {
			 return 0 ;
		 }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
System.out.println("enter the number of items");
int n=sc.nextInt();
System.out.println("enter the price of items");
double prices[]=new double[n];
for(i=0;i<n;i++)
{
	
	prices[i]=sc.nextDouble();
}
Bill ob=new Bill(prices);
double TotalPrice= CheckTotalPrice(n,prices);
System.out.println("the total price is " + TotalPrice);
double Discount=CheckDiscount(TotalPrice);
System.out.println("dicount applied is " + Discount);
double FinalAmount= TotalPrice-Discount;
System.out.println("the final amount to pay is " + FinalAmount);
	}

}
