package logics;

public class ArmStrongNumber 
{
   public static void main(String[] args) 
   {
	    int orgNum=153;
	    int sum=0;
	    
	    for(int i=orgNum;i>0;i=i/10)
	    {
	    	int rem = i%10;
	    	sum = sum + (rem* rem* rem);
	    	
	    }
	    
	    if (orgNum == sum)
	    {
			System.out.println("Given number is ArmStrong Number");
			
		}
	    else 
	    {
            System.out.println("Given number is not-ArmStrong Number");
		}
   }
}
