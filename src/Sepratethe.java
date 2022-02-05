
public class Sepratethe {

	public static void main(String[] args) {
		
		String str="sampletestdat a12sdas 222 ";
		int count=0;
		StringBuffer alpha = new StringBuffer(), num=new StringBuffer(),spac=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
alpha.append(str.charAt(i));				
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				num.append(str.charAt(i));
				count++;
			}
			else
			{
				spac.append(str.charAt(i));
		}
		}		
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(count);
	}
	}
