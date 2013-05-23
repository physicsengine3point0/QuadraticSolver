import java.util.*;
import java.math.*;

public class Averages
{
  public static double Mean(Double[] numbers)
	{
		double sumNumbers=0;
		double result=0;
		for(int i=0; i<numbers.length; i++)
		{
			sumNumbers+=numbers[i];
		}
		result=sumNumbers/numbers.length;
		return result;
	}
	
	public static double Median(Double[] numbers)
	{
		double median=0;
		for(int a=numbers.length; a>0; a--)
		{
			for(int b=0; b<a-1; b++)
			{
				if(numbers[b]>numbers[b+1])
				{
					Double temp=numbers[b];
					numbers[b]=numbers[b+1];
					numbers[b+1]=temp;
				}	
			}
		}
		if((numbers.length/2)%2==0)
		{
			double medtest1=numbers[numbers.length/2];
			double medtest2=numbers[numbers.length/2+1];
			median=(medtest1+medtest2)/2;
		}
		else
		{
			double medtest3=numbers[numbers.length/2];
			median=Math.ceil(medtest3);
		}
		return median;
	}
	public static double Range(Double[] numbers)
	{
		for(int a=numbers.length; a>0; a--)
		{
			for(int b=0; b<a-1; b++)
			{
				if(numbers[b]>numbers[b+1])
				{
					Double temp=numbers[b];
					numbers[b]=numbers[b+1];
					numbers[b+1]=temp;
				}	
			}
		}
		double lowRange=numbers[0];
		double highRange=numbers[numbers.length-1];
		double range=highRange-lowRange;
		return range;
	}
	
	public static double Mode(Double[] numbers)
	{
		double mode;
		double numTimes = 0;
		double maxTimes = 0;
		double maxNum = 0;
		for(int i=0; i<numbers.length; i++)
		{
			numTimes=0;
			for(int k=0; k<numbers.length; k++)
			{
				if(numbers[i]==numbers[k])
				{
					numTimes+=1;
				}
			}
			if(numTimes>maxTimes)
			{
				System.out.println(numTimes);
				maxTimes=numTimes;
				maxNum=numbers[i];
			}
		}
		mode=maxNum;
		return mode;
	}
	public static void main(String[] args)
	{

		Scanner scanney=new Scanner(System.in);
		System.out.print("How many numbers do you want to enter?");
		int howMany=scanney.nextInt();
		Double[] numbers=new Double[howMany];
		for(int i=0; i<howMany; i++)
		{
			System.out.println("Enter the next number:");
			double nextOne=scanney.nextDouble();
			numbers[i]=nextOne;
		}
		double med1=Median(numbers);
		double mean1=Mean(numbers);
		double range1=Range(numbers);
		double mode1=Mode(numbers);
		System.out.println("The median is "+med1+" the mean is "+mean1+" the range is "+range1+" the mode is "+mode1);
	}
}
