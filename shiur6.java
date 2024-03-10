import java.util.Scanner;
import java.util.Random;
public class Tester
{
	 
	 
public static void f1()
{ 
	Scanner scan=new Scanner(System.in);
	int sum=0,i;
	double avg;
        for (i=0;i<5;i++)
	 {
				  
			 System.out.println("Enter number:");
			 int grade=scan.nextInt();
			 sum=sum+grade;
         }
			 avg=(sum/5);
			 System.out.println(avg);
	  }

	 public static void f2()
	 { 
           String str;
           int count=0;
           Scanner scan=new Scanner(System.in);
	do{
		 System.out.println("enter mahrozet");
                 str=scan.next();
	         count++;
	  }while (str.equals("enter")==false);
		 System.out.println(count);
	  }
	 
	 public static void f3(int code)
	 { 
		int x=1;
		Scanner scan=new Scanner(System.in);
		do{
		     System.out.println("enter code");
		     int codeM=scan.nextInt();
		     x++;
		     if (codeM==code)
		     {
			 System.out.println("How much money");
		         break;
		     }
		    	 
		  }while (x<=3);
		
		   if (x>3)
			 System.out.println("Error");
			
	  }
	 
	 public static void f4(String str )
	 { 
		for (i=0; i<str.length()/2; i++);
		{
		  System.out.println("enter mahrozet");
		  char letter1, letter2,letter3; 
	          if (str.charAt(i)==str.charAt(str.length()-(i+1))
	          System.out.println("true");     
		}
	  }
	 
		 
	 public static void f5(int num )
	 { 
	     System.out.println("the numbers amithalkim in "+num+":");
	     for (int i = 1;i <=num;i++) {
         	if (num % i==0) {
	    		System.out.print(i);
	    		if (i != num)
	    			System.out.print(",");
	    }	
	  }
	 }   
	  
	 public static void f6()
	 {
		 int i,j;
		 for (i=1; i<=10; i++)
		 {
			 for (j=1; j<=10; j++)
				 System.out.print(j*i);
			 System.out.println();
		 }
	 }
	 
	 public static void f7()
	 {
		 int i,num;
		 int max=0;
		 int min=100;
		 for (i=1;i<=7;i++)
		 {
				System.out.println("enter grade"); 
				Scanner scan=new Scanner(System.in);
			    num=scan.nextInt();
			    if (num>max)
			    	max=num;
			    if (num<min)
			    	min=num;
		 }
			System.out.println(min+", "+max); 
	 }

	 public static void f9(int num1,int num2)
	 { 
		 int i,sum=0;
		 for (i=0;i<num2;i++)
		 	 sum=num1+sum;
		 System.out.println(sum); 
	 }



		 
	 public static void f13(int a1, int d, int n)
	 { 
		 int i,an;
		 for (i=1;i<=n;i++) {
		 	 an=a1+(i-1)*d;
		 	System.out.print(an+","); 
		 }
	 }

	  
 
 
