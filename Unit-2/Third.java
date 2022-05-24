package ExceptionHandling;
import java.util.Scanner;

public class Third {
	private static int a;
	private static int b;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		Three obj = new Three(a, b);
		try {
			obj.divide();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
class Three {
	int a, b;
	
	Three(int a, int b){
		this.a = a;
		this.b = b;
	}
	void divide() throws Exception{

		int res = 0;
		try {
			res = a/b;
		}
		catch(ArithmeticException e) {
			throw new Exception("Custom Exception");
		}
		finally {
			System.out.println(res);
		}
	}
}

