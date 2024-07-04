package logics;

public class ReverseNumberWithFunction {

	public static void main(String[] args) 
	{

	   int orgNum=  123456;
	   String org = Integer.toString(orgNum);     //convert integer into string
	   
	   String rev="";
	   
	   for(int i=org.length()-1;i>=0;i--)
	   {
		   rev=rev+org.charAt(i);
	   }
	   
	   
	   int revNum = Integer.parseInt(rev);        //convert string to integer
	   System.out.println(revNum);
	   
	   
	   
	}

}
