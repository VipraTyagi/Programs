package program.jav.basic;
import java.util.Scanner; 

public class prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i,c=0;
System.out.println("Enter a number to be checked whether prime or not");
Scanner in = new Scanner(System.in); 
n= in.nextInt(); 

     
	for(i=1;i<=n;i++)
	{
		 if(n%i==0)
		 {     c=c+1; 
		                   
		 }	 
	}
	
	if(c==2) {
		 System.out.println("Entered number is  prime");
	}
	else {
		System.out.println("Entered number is not prime");
	}
	
	}
	}
