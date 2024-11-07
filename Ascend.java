// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		int a = (int)(Math.random()*limit);
		int b = (int)(Math.random()*limit);
		int c = (int)(Math.random()*limit);
		int min = Math.min(Math.min(a, b),c);
		int max = Math.max(Math.max(a, b),c);
		int middle = a + b + c - min - max;
		System.out.println(a + " " + b + " " + c);
		System.out.println(min + ", " + middle + ", " + max);
	}
}