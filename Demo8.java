package QUE_8;
/*Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors.*/

class Base1{
	int a=9;
	Base1(int a){
		this.a = a;
		System.out.println("in Base1 constructor a= " + a);
	}
}

class Sub1 extends Base1{
	Sub1(){
		super(70);
		System.out.println("in constructor of sub1");
	}
	Sub1(int b){
		super(80);
		System.out.println("in constructor of sub1");
	}
	Sub1(int b, int c){
		super(90);
		System.out.println("in constructor of sub1");
	}
	
}
public class Demo8 {
	

	public static void main(String[] args) {
	Sub1 ref = new Sub1();
	Sub1 ref1 = new Sub1(65);
	Sub1 ref2 = new Sub1(65,32);
	}

}
