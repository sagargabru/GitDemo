
public class StringPalindrom {

	public static void main(String[] args) {
		
	String str="aba",rev="";
	
    int a=str.length();
    
	for(int i=a-1;i>=0;i--)
	
		rev =rev+str.charAt(i);
	
	if(str.equals(rev))
	{
		System.out.println("palindrom");
	}
	
	else
	{
		System.out.println("Not palindrom");
	}
	}
	}

