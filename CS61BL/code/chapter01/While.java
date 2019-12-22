
public class While {
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println(sum(a, b));

		int c = 10;
		while (c > 0) {
			System.out.println(a);
			c--;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

