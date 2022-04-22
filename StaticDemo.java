package practical_programs;

public class StaticDemo {
	public static void main(String args[]) {
		Second.displayCount();
		Second.increaseCount();
		Second.increaseCount();
		Second.increaseCount();
		Second.increaseCount();
		Second.displayCount();
	}
}

class Second {
	static int count = 0;
	static void increaseCount() {
		count++;
	}
	static void displayCount() {
		System.out.println(count);
	}
}
