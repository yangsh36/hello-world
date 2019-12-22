public class HelloNumbers {
	public static void main(String[] args) {
		int k = 0;
		int sum = 0;
		while (k < 10) {
			System.out.println(sum + " ");
			k += 1;
			sum += k;
		}
	}
}