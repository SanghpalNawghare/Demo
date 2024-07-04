package logics;

public class ReverseNumber {

	public static void main(String[] args) 
	{
         int orgNum=123456789;
         int revNum=0;
         
         for(int i=orgNum;i>0; i=i/10)
         {
        	 int rem = i%10;
        	 revNum=revNum*10 +rem;
         }
         
         System.out.println(revNum);
	}

}
