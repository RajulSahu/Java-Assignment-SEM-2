package practical_programs;
import java.util.*;

public class GreatestNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Third obj = new Third();
		int res = obj.findGreatest(a, b, c);
		System.out.println(res);
	}

}
class Third {
	public int findGreatest(int a, int b, int c) {
		int max = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
		return max;
	}
}

