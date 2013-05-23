/**
*Sorts strings using a linkedlist
*/

import java.util.*;

public class StringSorter
{
  private LinkedList<String> list;
	public StringSorter()
	{
		list=new LinkedList<String>();
	}
	public void add(String str)
	{
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i).compareTo(str)>0)
			{
				list.add(i, str);
				return;
			}
		}
		list.add(str);
	}
	public String get(int index)
	{
		return list.get(index);
	}
	public int indexOf(String str)
	{
		return list.indexOf(str);
	}
	public String[] getArray()
	{
		String[] array=new String[list.size()];
		list.toArray(array);
		return array;
		
	}
	
	public static void main(String[] args)
	{
		StringSorter jacob=new StringSorter();
		jacob.add("Noah");
		jacob.add("Nicole");
		jacob.add("Tim");
		jacob.add("OtherTim");
		jacob.add("N@T#@N");
		jacob.add("Alec");
		jacob.add("Noah");
		System.out.println("The third value alphanumerically is: "+jacob.get(3));
		System.out.println("The index of nathan is "+jacob.indexOf("N@T#@N"));
		System.out.println("The index of noah is gonna throw an: "+jacob.indexOf("Noah"));
		String[] DOOOM=jacob.getArray();
		System.out.println(DOOOM[3]);
	}
}
