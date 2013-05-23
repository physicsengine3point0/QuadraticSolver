
public class BigInteger 
{
  Boolean negative=false;
	int[] waterBottle;
	public BigInteger (String str)
	{
		negative=false;
		waterBottle = new int[str.length()];
		if(str.charAt(0)=='-') negative=true;
		for(int k = str.length()-1; k>=0; k--)
		{
			//if(str.charAt(k)=='-') negative=true;
			waterBottle[k]=(int)str.charAt(k);
		}
	}
	
	public BigInteger (int num)
	{
		this(Integer.toString(num));
	}
	
	public int get(int index)
	{
		return waterBottle[index];
	}
	
	public int numDigits()
	{
		return waterBottle.length;
	}
	
	public String toString()
	{
		char[] phone;
		int godel;
		if(negative==true)
		{
			phone = new char[waterBottle.length+1];
			phone[0]='-';
			godel=1;
		}
		else
		{
			phone = new char[waterBottle.length];
			godel=0;
		}
		
		for (int n=godel;n<phone.length-1 ; n++)
		{
			phone[n]= (char) (waterBottle[n]);
		}
		
		String Pink = new String(phone);
		return Pink;
	}
	
	public BigInteger multiply(BigInteger that)
	{
		int carry=0;
		int[] product = new int[this.numDigits() + that.numDigits() + 1];
		for(int i=that.numDigits()-1;i>=0;i--)
		{
			for(int j=this.numDigits()-1;j>=0;j--)
			{
				int temp = this.get(j)*that.get(i);
				product[i+j] += temp%10 + carry;
				carry = temp/10;
			}
			product[i+that.numDigits()] += carry;
		}
		
		for(int i=0;i<product.length;i++)
		{
			System.out.println(product[i]);
		}
		
		
		int carry2=0;
		for(int a=product.length-1; a>0; a--)
		{
			if(product[a]>9)
			{
				carry2=product[a]/10;
				product[a]=product[a]%10;
				product[a-1]+=carry2;
			}
		}
		product[0]=carry2;
		
		
		//We now (in)efficiently convert this into the necessary class.
		char[] answer_char=new char[product.length];
		for(int i=0; i<product.length; i++)
		{
			answer_char[i]=(char)(product[i]+48);
		}
		String answer_string=new String(answer_char);
		BigInteger answer_final = new BigInteger(answer_string);
		if(this.negative || that.negative)
		{
			if(!(this.negative && that.negative)) answer_final.negative=true;
		}
		return answer_final;
	}
	
	public static void main(String[] lorena)
	{
		BigInteger batman=new BigInteger("213231231231231231231233123");
		BigInteger noah= new BigInteger("666666666666666666666");
		System.out.println(noah.toString());
		System.out.println(batman.toString());
		System.out.println(batman.multiply(noah).toString());
	}
}
