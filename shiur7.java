
public class AP 
{
	private int a1;
	private int d;
	 public AP(int fM,int diff)
	{
		a1 =fM;
		d =diff;
	}
	 public void printGeneralSeries()
	{
	     System.out.println("an="+a1+"+"+d+"*(n-1)"); 
	}
	 public int memberCalculation(int n)
	{
		int an=a1+d*(n-1);
		return an;
	} 
	 public int calculateN (int an) 
	{
		double n;
		n= (double) (((an-a1)/d)+1);
		int n1=(int)n;
		if(n1-n==0)
			return n1;
		else
			return 0;
	}
	
}
