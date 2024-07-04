package logics;

public class ReverseWithoutStringFunction {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int Org=123456;
		int rev=0;
		
		for(int i=Org;i>0;i=i/10)
		{
			 int rem = i%10;
		     rev=rev*10 + rem;
		}
		
		System.out.println(rev);

	}

}
