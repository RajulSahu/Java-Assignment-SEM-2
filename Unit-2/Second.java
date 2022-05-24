package ExceptionHandling;

import java.util.Scanner;

public class Second {
	private static int a;
	private static int b;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		Two obj = new Two(a, b);
		try {
			obj.divide();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
class Two {
	int a, b;
	
	Two(int a, int b){
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
