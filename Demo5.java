//create abstract class Shape. declare "draw()" function as abstract. From this class define "Triangle","Polygon" and "Circle" .
//create an array of Shape having 3 elements.
//store child objects into this array . and call
//their draw function
//create an array of Shape having 3 elements.
//store child objects into this array . and call
//their draw function.

package assign4_3;

abstract class Shape{
	void draw();
}

class Triangle
{
	public void draw() {
	System.out.println("in triangle class");
	}
}

class Polygon
{
	public void draw() {
	System.out.println("in Polygon class");
	}
}

class Circle
{
	public void draw() {
	System.out.println("in Circle class");
	}
}
public class Demo5{

	public static void main(String[] args) {
		Shape arr[] = new Shape[3];
	arr[0] = new Triangle();
	arr[1] = new Polygon();
	arr[2] = new Circle();
	for(i=0;i<=arr.length;i++) {
		arr[i].draw();
	}
	}

}
