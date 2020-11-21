package assign4_2;
//create a class "Vehicle", define a method "public void start()" in it. 
//From this class derive a class FourWheeler. How will u override "start()" method of parent class ?
class Vehicle {
	public void start() {
		System.out.println("in start method of super class ");
	}
}
class FourWheeler extends Vehicle{
	public void start() {
		super.start();
		System.out.println("in start method of super class ");
	}
}

public class Demo2 {
	public static void main(String args[])
	{
	FourWheeler four = new FourWheeler();
	four.start();
	}

}
