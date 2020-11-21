package assign4_3;
//Go for Hierarchical inheritance, create instances of child class and observe constructor invocation
class A{
	int a;
	A(int a){
	this.a = a;
	}

void disp1(){
	System.out.println("in disp1 of class A" + a);
}
}

class B extends A{
	
int b;
B( int b) {
		super(b);
		this.b = b;
	}

void disp2(){
	System.out.println("in disp2 of class B");
}
}

class C extends A{
	

C(int c) {
		super(40);
		
	}

void disp3(){
	System.out.println("in disp1 of class A");
}
}
public class Demo3 {

	public static void main(String[] args) {
	C ref = new C(5);
		ref.disp1();
		ref.disp3();
	}

}
