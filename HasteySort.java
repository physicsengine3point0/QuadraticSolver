/**
* A slightly less efficient version of QuickSort.
*/

import java.util.*;

public class HasteySort //
{

  
public static void organize(ArrayList<Integer> input, int start, int finish)
{
	if(finish-start<3)
	{
		selectionSort(input, start, finish);
		return;
	}
	else
	{
		int pivotIndex=(int)(Math.random()*(finish-start)+start);
		int focus=start; //this is what we are currently comparing
		int temp=input.get(start);
		input.set(start, input.get(pivotIndex));
		input.set(pivotIndex, temp);
		pivotIndex=start+1;
		while(focus<input.size())
		{
			if(input.get(focus)<=input.get(pivotIndex))
			{
				swap(input, focus, pivotIndex+1);
				swap(input, pivotIndex, pivotIndex+1);
			}
			focus++;
		} //at this point we should be split into two separate groups, which we will now sort recursively.
		organize(input, start, pivotIndex);
		organize(input, pivotIndex, finish);
	}
}

public static void swap(ArrayList<Integer> input, int start, int finish) //tested, seems functional
{
	int temp=input.get(finish);
	input.set(finish, input.get(start));
	input.set(start, temp);
}

public static void sort(ArrayList<Integer> input)
{
	organize(input, 0, input.size()-1);
}


public static void selectionSort(ArrayList<Integer> input, int start, int finish)
{
	for(int a=start; a<finish+1; a++)
	{
		for(int b=a+1; b<finish+1; b++)
		{
			if(input.get(a)>input.get(b))
			{
				swap(input, a, b);
			}
		}
	}
}

public static void main(String[] goats)
{
	ArrayList<Integer> numbers=new ArrayList<Integer>();
	for(int beaufore=0; beaufore<1024; beaufore++)
	{
		numbers.add((int)(Math.random()*10000));
	}
	sort(numbers);
	for(int king=0; king<numbers.size(); king++)
	{
		System.out.println(numbers.get(king));
	}
}


}
