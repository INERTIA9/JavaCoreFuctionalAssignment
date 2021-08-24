
	import java.util.*;
	import java.lang.Math;
	public class Quadratic {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter quadratic equation: ax^2 + bx +c ");
	double a= s.nextDouble();
	double b = s.nextDouble();
	double c = s.nextDouble();
	System.out.println("Entered quadtratic equation is = "+a +"x^2" + "+" + +b + "x" +"+" +c);
	double delta = b*b - 4*a*c;
	if(delta>0) {
	double root1 = (-b + Math.sqrt(delta)) / (2*a);
	double root2 = (-b - Math.sqrt(delta)) / (2*a);
	System.out.println("ROOTS OF THE EQUATION ARE = "+root1 +"," +root2);
	}
	else if(delta==0) {
	double root1=-b / 2*a;
	double root2=-b / 2*a;
	System.out.println("ROOTS OF THE EQUATION ARE = "+root1+ ";" +root2);
	}
	else {
	double root1 = -b / (2*a);
	double root2 = -b / (2*a);
	double imaginar= Math.sqrt(-delta)/(2*a);
	System.out.println("ROOTS OF THE EQUATION ARE = " +root1 + "+" +imaginar + "i" + " "+root1 +"-" +imaginar + "i");
	}
	}
    }
