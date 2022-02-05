
public class SperationString {
	public static void main(String[] args) {
		
		String str="sagar456shinde";
		StringBuffer num=new StringBuffer(),
		alpha=new StringBuffer(),special = new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
			
	if(Character.isAlphabetic(str.charAt(i)))
		
	alpha.append(str.charAt(i));
	else if (Character.isDigit(str.charAt(i)))
		
	num.append(str.charAt(i));
	else 
	special.append(str.charAt(i));
		}
		
	System.out.println(alpha);
	System.out.println(num);
	System.out.println(special);
	
	
		
	
	
			
				
				
			
			
		
		
	}
	}

