import java.util.*;


/**
* Sorting algorithms.  Bubble and Selection.  Not sure whether they work.
/

public class arrayListSort
{
  //selection sort
	public static void main(String args[])
	{
		ArrayList<String> data=new ArrayList<String>();
		data.add("Timmy");
		data.add("Tim");
		data.add("Alec");
		data.add("Nathan");
		data.add("Jacob");
		data.add("Derwin");
		data.add("Alix");
		data.add("Nicole");
		selectionSort(data);
		System.out.println("Sorted alphabetically:");
		for(int i=0; i<data.size(); i++)
		{
			System.out.println(data.get(i));
		}
	}
	public static void selectionSort(ArrayList<String> data) 
	{
		for(int a=0; a<data.size(); a++/**iterator*/)//for loop
		{
			for(int b=a+1; b<data.size(); b++/**iterator*/)//for loop
			{
				if(data.get(a).compareTo(data.get(b))>0)
				{
					String temp=data.get(a);
					data.set(a, data.get(b));
					data.set(b, temp);
				}
			}
		}
	}	
	//bubble sort
	public static void bubbleSort(ArrayList<String> data)
	{
		for(int a=data.size()-1; a>0; a--)
		{
			for(int b=0; b<a; b++)
			{
				if(data.get(b).compareTo(data.get(b+1))>0)
				{
					String temp=data.get(b);
					data.set(b, data.get(b+1));
					data.set(b+1, temp);
				}
			}
		}
	}
}	
