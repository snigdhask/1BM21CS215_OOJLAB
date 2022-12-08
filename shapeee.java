import java.lang.*;

abstract class shape
{
 int a, b;
 double area;
 final double pi = 3.142;
 shape(int x, int y)
 {
  a=x;
  b=y;
  area=0;
 }
abstract void printArea();
}

class rectangle extends shape
{
 rectangle(int a, int b)
 {
  super(a,b);
 }
 void printArea()
 {
  area=a*b;
  System.out.println("Area of the rectangle = "+area);
 }
}

class triangle extends shape
{
 triangle(int a, int b)
 {
  super(a, b);
 }
 void printArea()
 {
  area=(0.5)*a*b;
  System.out.println("Area of the triangle = "+area);
 }
}

class circle extends shape
{
 circle(int a)
 {
  super(a, -1);
 }
 void printArea()
 {
  area=pi*Math.pow(a,2);
  System.out.println("Area of the circle = "+area);
 }
}

class demoshape
{
 public static void main(String args[])
 {
  rectangle r1 = new rectangle(1, 2);
  triangle t1 = new triangle(3, 4); 
  circle c1 = new circle(5);
  shape ref;
  ref = r1;
  ref.printArea();
  ref = t1;
  ref.printArea();
  ref = c1;
  ref.printArea();
 }
}
