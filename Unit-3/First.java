package ExceptionHandling;
import java.util.*;

public class First {
	private static int a;
	private static int b;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		One obj = new One(a, b);
		obj.divide();
	}
}
class One {
	int a, b;
	
	One(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	void divide() {
		int res = 0;
		try {
			res = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println(res);
		}
	}
}
