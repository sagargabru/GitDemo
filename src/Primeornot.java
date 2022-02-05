

public class Primeornot {

	public static void main(String[] args) {
		
		int temp,sum=0,r;
		int n=545;
		
		temp=n;
		
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		
		if(temp==sum)
		{
			System.out.println("ahe");
		}
		else
		{
			System.out.println("nahi");
		}
	
	
		
	
	
}
}
