
//Untested Trie data structure
public class TrieNode
{
  char holding;
	TrieNode[] branches=new TrieNode[26];
	
	public TrieNode()
	{
		this.populate();
	}
	
	public TrieNode(String str)
	{
		this.add(str);
		this.populate();
	}
	
	public TrieNode(char ch)
	{
		holding=ch;
		this.populate();
	}
	
	public boolean wordExists(String str)
	{
		if(this.branches[equivalentNumber(str.charAt(0))]!=null) return this.wordExists(removeFirstLetter(str));
		return false;
	}
	
	public void populate()
	{
		TrieNode node;
		for(int i=0; i<branches.length; i++)
		{
			node=new TrieNode();
			branches[i]=node;
		}
	}
	
	public static void addLetter(TrieNode trie, char ch)
	{
		trie.holding=ch;
	}
	
	public static void addWord(TrieNode trie, String str)
	{
		trie.add(str);
	}
	
	public char[] word2CharArray(String str)
	{
		char[] result=new char[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			result[i]=str.charAt(i);
		}
		return result;
	}
	
	public static int equivalentNumber(char ch)
	{
		return ((int)ch)-97;
	}
	
	public void add(String str)
	{
		if(str.length()==1)
		{
			holding=str.charAt(0);
			return;
		}
		if(this.sameChar(str.charAt(0)))
		{
			branches[equivalentNumber(str.charAt(0))].add(removeFirstLetter(str));
		}
		else
		{
			holding=str.charAt(0);
			branches[equivalentNumber(str.charAt(0))].add(removeFirstLetter(str));
		}
	}
	
	public boolean sameChar(char ch)
	{
		if(this.getHeld()==ch) return true;
		return false;
	}
	
	public char getHeld()
	{
		return holding;
	}
	
	public static String removeFirstLetter(String str)
	{
		char[] characters=new char[str.length()-1];
		for(int i=1; i<str.length(); i++)
		{
			characters[i-1]=str.charAt(i);
		}
		String result=new String(characters);
		return result;
	}
}
