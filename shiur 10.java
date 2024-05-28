public static void f1(int[] arr, int index)
{
	if ((index>0)&&(index<arr.length))
	{
		if (arr[index]%2!=0)
		{
			arr[index]=arr[index]+1;
		}
		
	}
	else
        System.out.println("Error!"); 
}



{
	 public static void main(String[] args)
	 int [] arr= {1,2,3,4,5};
}



public static void f2(int[] arr)
{
	int grade= arr[0]+arr[1]+arr[2]+arr[3]/arr.length;
    System.out.println(); 

}



{
	 public static void main(String[] args)
	 int [] arr= {60,70,80,90};
}




public static void f3(int[] arr)
{
	int maxG,minG;
	if ((arr[0]>0)&&(arr[0]<arr.length))
		arr[0]=maxG;
	if ((arr[1]>arr[0])&&(arr[1]<arr.length))
		arr[1]=maxG;
	if ((arr[2]>arr[1])&&(arr[2]<arr.length))
		arr[2]=maxG;
      System.out.println("the biggest grade is"+maxG); 
      
  	if ((arr[0]>0)&&(arr[0]<arr.length))
		arr[0]=minG;
	if ((arr[1]<arr[0])&&(arr[1]<arr.length))
		arr[1]=minG;
	if ((arr[2]<arr[1])&&(arr[2]<arr.length))
		arr[2]=minG;
      System.out.println("the smallest grade is"+minG); 
}



	 public static void main(String[] args) {
	
	 int [] arr= {10,20,30};
}











import java.util.Random;
public class Tester1 
{

	public static void main(String[] args) 
	{
		AP ap1 = new AP(2,1);
		ap1.pgs();
		int x = ap1.mc(5);
		System.out.println(x);		
		int y= ap1.cn(5);
		System.out.println(y);	
	}
	
	public static void arr(int rows, int c)
	{
		int[][] arr= new int [rows][c];
		Random rand= new Random();
			for(i=0;i<rows;i++)
		{
			for(j=0;j<c;j++)
			{
				arr[i][j] = rand.nextInt(101);
			}
		}
			public static void p(int[][] arr)
			{
				for(int i=0;i<arr.length;i++)
				{
					for (int j=0;j<arr[i].length;j++)
					{
						System.out.println(arr[i][j] + " ");
					}
				}
				  System.out.println();
			}
	}
}



