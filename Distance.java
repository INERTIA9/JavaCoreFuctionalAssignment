
	import java.io.InputStream;
	import java.util.*;
	public class Distance {
	public static void main(String[] args) {
	double x1;
	double y1;
	System.out.println("Enter the coordinates:x1,y1");
	Scanner s  =new Scanner(System.in);
	x1 = s.nextDouble();
	y1 = s.nextDouble();
	double distance = Math.sqrt((Math.pow(x1, 2) + (Math.pow(y1, 2))));
	System.out.println("Eucledian distance between entered coordinates is = "+distance);
	}
	}
