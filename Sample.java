
class Sample{
	int x,y; //instance fields

	void setData()
	{ x=111; y=222; }

	void getData()
	{ System.out.println("x val is : "+x);
	  System.out.println("y val is : "+y); }

	public static void main(String args[])
	{ Sample s=new Sample(); 
	                s.setData(); 
					s.getData(); }
}



