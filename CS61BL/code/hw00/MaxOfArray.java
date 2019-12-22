public class MaxOfArray {
   public static int max(int[] m) {
      int max = 0;
      int index = 0;
      while (index < m.length) {
      if (m[index] > max) {
      max = m[index];
      }
      index += 1;
   }
   return max;
}
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
      System.out.println(max(numbers));      
   }
}