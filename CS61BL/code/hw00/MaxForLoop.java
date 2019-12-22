public class MaxForLoop {
    /** Uses a basic for loop to sum a. */
    public static int max(int[] a) {
      int max = 0;
      for (int i = 0; i < a.length; i += 1) {
        if (a[i] > max) {
          max = a[i];
        }
      }
      return max;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 35, 22, 33, 44, 10, 6}; 
       System.out.println(max(numbers));     
    }
}


/*
for (initialization; termination; increment) {
    statement(s)
}
*/