import java.util.*;

/**
* Treeset example.
*/

public class Tree_test
{
  public static TreeSet<String> sortTree=new TreeSet<String>();

	public static void main(String[] args)
	{
		ArrayList<String> tree=new ArrayList<String>();
		tree.add("Bun");
		tree.add("Shoe");
		tree.add("Tree");
		tree.add("Door");
		tree.add("Hive");
		tree.add("Bricks");
		tree.add("Heaven");
		tree.add("Gate");
		tree.add("Pine");
		tree.add("Hen");
		TreeSort(tree);
		for(int k=0; k<tree.size(); k++)
		{
			System.out.println(tree.get(k));
		}
	}
	
	public static void TreeSort(ArrayList<String> list)
	{
		for(int i=0; i<list.size(); i++)
		{
			sortTree.add(list.get(i));
		}
		for(int j=0; j<list.size(); j++)
		{
			list.set(j, sortTree.pollFirst());
		}
	}
}
