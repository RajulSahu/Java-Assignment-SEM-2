package practical_programs;

public class Constructor {
    public static void main(String[] args) {
        Second obj = new Second();
        int res = obj.findSum(args);
        System.out.println(res);
    }

}
class Second {
    public int findSum(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        return sum;
    }
}
