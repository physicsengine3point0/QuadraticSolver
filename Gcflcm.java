



/*
 * 
 */

import java.util.*;

public class gcflcm
{
  public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int firstNum=scan.nextInt();
		System.out.println("Enter another number");
		int secondNum=scan.nextInt();
		int greatest=gcf(firstNum, secondNum);
		int least=lcm(firstNum, secondNum);
		System.out.println("The greatest common factor of these numbers is "+greatest+" and the least common multiple is "+least);
	}
	
	public static int lcm(int a, int b)
	{
		int num1=a;
		int num2=b;
		int lcm=0;
		if(num1>num2)
		{
			if(num1%num2==0)
			{
				lcm=num1;
			}
			else
			{
				for(int i=2; i<num1; i++)
				{
					if((num1*i)==0)
					{
						lcm=num1*i;
					}
				}
			}
		}
		else
		{
			if(num2%num1==0)
			{
				lcm=num2;
			}
			else
			{
				for(int i=2; i<num2; i++)
				{
					if((num2*i)==0)
					{
						lcm=num1*i;
					}
				}
			}
		}
		if(lcm==0)
		{
			lcm=num1*num2;
		}
		return lcm;
	}
	public static int gcf(int a, int b)
	{
		int num1=a;
		int num2=b;
		int gcf=1;
		if(num1>num2)
		{
			if(num1%num2==0)
			{
				gcf=num2;
			}
			else
			{
				for(int i=2; i<num2; i++)
				{
					if(num1%i==0 && num2%i==0)
					{
						gcf=i;
					}
				}
			}
		}
		else
		{
			if(num2%num1==0)
			{
				gcf=num1;
			}
			else
			{
				for(int i=2; i<num1; i++)
				{
					if(num1%i==0 && num2%i==0)
					{
						gcf=i;
					}
				}
			}
		}
		return gcf;
	}
}
