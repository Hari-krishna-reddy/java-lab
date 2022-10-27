import java.util .*;
abstract class Shape
{
int a=10,b=20;
abstract public void printarea();
}
class Rectangle extends Shape
{
 double arearect;
 public void printarea()
{
arearect=a*b;
System.out.println("The area of rectangle is:"+arearect);
}
}
class Triangle extends Shape
{
double areatri;
public void printarea()
{
areatri=0.5*a*b;
System.out.println("The area of triangle is:"+areatri);
}
}class Circle extends Shape
{
double areacircle;
public void printarea()
{
areacircle=3.14*a*a;
System.out.println("The area of circle is:"+areacircle);
}
}


public class abstractClasses {


	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.printarea();
		Triangle t=new Triangle();
		t.printarea();
		Circle r1=new Circle();
		r1.printarea();
		
	}
}

/*
output:
The area of rectangle is:200.0
The area of triangle is:100.0
The area of circle is:314.0
*/
		
	


	


	
	
	












