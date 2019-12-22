public class fib2 {
	public static int fib2(int n, int k, int f0, int f1) {
		if (n == k) {
			return f0;
		}
		else {
			return fib2(n, k + 1, f1, f0 + f1);
		}
	}

    public static void main(String[] args) {
    	int a = 20;
    	int b = 0;
    	int c0 = 0;
    	int c1 = 1;
    	System.out.println(fib2(a, b, c0, c1));
    }
}

