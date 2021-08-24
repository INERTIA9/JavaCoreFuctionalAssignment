
	import java.util.*;
	import java.lang.*;
	public class WindChill {
	public static void main(String[] args) {
	double t;
	double v;
	System.out.println("Enter the temperature and spped: t,v");
	Scanner s = new Scanner(System.in);
	t = s.nextDouble();
	v  =s.nextDouble();
	if(t<50 && v<120) {
	double w = 35.74 + 0.6215*t+(0.4275*t - 35.75)*Math.pow(v, 0.16);
	System.out.println("WindChill= "+w + "mph");
	}
	else {
	System.out.println("Entered data is out of range");	
	}
	}
    }
