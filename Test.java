public class Test 
{
	public static void main(String[] args)
	{
		Utility u=new Utility();
		//System.out.println(u.sum(10,20)==30);
		try
		{
			assert u.sum(10, 20)==40 : "sum did not return the expected value 40";
		}
		catch(AssertionError ar)
		{
				System.out.println(ar);
		}
		System.out.println(u.sum(10,-20)==-10);
		System.out.println(u.sum(-10,20)==10);
		System.out.println(u.sum(-10,-20)==-30);
		System.out.println(u.sqr(10)==100);
		System.out.println(u.sqr(-10)==100);
		System.out.println(u.sqr(0)==0);
		System.out.println(u.power(5,3)==125);
		System.out.println(u.power(5,0)==1);
		System.out.println(u.power(-5,3)==-125);
		System.out.println(u.power(-5,2)==25);
	}
}
