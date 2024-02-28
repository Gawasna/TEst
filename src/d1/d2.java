package d1;
import K1.*;
public class d2 {
	 
public static void main (String args[]) {
		int x=3;
		int y=2;
		System.out.println("Hello world 2");
		System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
		
		d2 a = new d2();
		System.out.println(a.sumxy(x, y));
		System.out.println(K2.Mulxy(x, y));
	}
   public static int sumxy(int x, int y) {
	int sum = x+ y;
	return sum;
}
}
