
class Biggest{
	int x,y; 

	void setData(int a,int b)
	{ x=a; y=b; }

	void findBiggest()
	    {   if(x>y)
		       System.out.println("biggest is : "+x);
	         else
			    System.out.println("biggest is : "+y); }

	public static void main(String args[ ])
	{ Biggest b= new Biggest( ); 
	                 b.setData(10,20 ); 
					 b.findBiggest(); }
}


