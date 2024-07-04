package logics;

public class StringPalidrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String org="MADAM";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		
		if (org.equals(rev)) 
		{
			System.out.println("Given String is String Palidrome");
		}
		else 
		{
            System.out.println("Given String is Not-String palidrome");
		}

	}

}
