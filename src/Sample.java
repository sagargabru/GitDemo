
public class Sample {

	public static void main(String[] args) {
		
		String str="Selenium testing F A N K M 2222 222 2";
		StringBuffer str2 = new StringBuffer();
		
		char[] Array=str.toCharArray();
		
		for(int i=0;i<Array.length;i++)
	 { 
		
		if((Array[i]!=' ') && (Array[i]!='\t'))
		{
			str2.append(Array[i]);
		}
		
	 }
		System.out.print(str2);
		
	 
		
		
	}


}