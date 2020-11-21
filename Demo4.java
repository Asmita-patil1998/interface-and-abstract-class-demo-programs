//Create a class "Top1" with "disp1()" method.
//From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
//Now show how will u achieve dynamic polymorphism.
package assign4_3;
class Top1{
	void disp1() {
		System.out.println("inside disp1 method of top1");
	}
}

class Bottom1 extends Top1{
	void disp1() {
		System.out.println("inside disp1 method of bottom1");
	}
}
class Bottom2 extends Top1{
	void disp1() {
		System.out.println("inside disp1 method of bottom 2");
	}
}
class Bottom3 extends Top1{
	void disp1() {
		System.out.println("inside disp1 method of bottom 3");
	}
}

public class Demo4 {
	static void diffDisp(Top1 ref ) {
		ref.disp1();
	}
	public static void main(String[] args) {

		diffDisp(new Bottom1());
		diffDisp(new Bottom2());
		diffDisp(new Bottom3());
	}

}
