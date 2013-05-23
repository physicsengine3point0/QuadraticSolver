import java.util.*;

public class BaskesQueue<E> implements Queue<E>
{
  private ArrayList<E> queue;
	public BaskesQueue()
	{
		queue=new ArrayList<E>();
	}
	public boolean add(E object)
	{
		return queue.add(object);
	}
	public E remove()
	{
		return queue.remove(0);
	}
	public E peek()
	{
		return queue.get(0);
	}
	public boolean isEmpty()
	{
		boolean temp=false;
		if(queue.size()==0)
		{
			temp=true;
		}
		return temp;
	}
	public static void main(String[] args)
	{
		Queue<String> q=new BaskesQueue<String>();
		q.add("Noah");
		q.add("Jacob");
		q.add("Nathan");
		q.add("Tim");
		System.out.println(q.remove());
		System.out.println(q.peek());
		if(q.isEmpty()!=true)
		{
			System.out.println("You are not empty");
		}
		
	}	
}
