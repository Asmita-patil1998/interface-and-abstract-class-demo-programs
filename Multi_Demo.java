//1) Create a multi-level inheritance , instantiate the child class and observe constructor invocation.
//Also show, if needed how will u invoke parent class constructor from child class ?

package assign4_1;
class First{
	int a;
	String str;
	
	First(int a){
		this.a = a;
	}
	
	
	First() {
		System.out.println("in first class def constr");
	}
	void demo()
	{
		System.out.println("a = " + a);
	}
}
class Second extends First{
	 int b;
	Second(int b , String str)
	{
		super(65);
		this.b = b;
		this.str = str;
	}
	void demo1()
	{
		System.out.println("b= "+ b);
	}
}

class Third extends Second{
	 int c= 9;
	 
	Third(int c)
	{
		super(76, "asmita");
		this.c = c;

	}
	void demo3()
	{
		System.out.println("c= "+ c);
	}
}


public class Multi_Demo {

	public static void main(String[] args) {
	Third th = new Third(68);
	th.demo3();
	th.demo();
	}

}
