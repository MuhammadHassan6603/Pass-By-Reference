class PassByRef
{
	int x,y;
	void swap(PassByRef o)
	{
		int temp;
		temp=o.x;
		o.x=o.y;
		o.y=temp;
	}
}
class Main
{
	public static void main(String args[])
	{
		PassByRef obj=new PassByRef();
		obj.x=10;
		obj.y=20;
		System.out.println("Before Calling Swap x = " + obj.x + "y = " + obj.y);
		obj.swap(obj);
		System.out.println("After Calling Swap x = " + obj.x + "y = " + obj.y);
	}
}