public class TriangleDrawer {
   public static void drawTriangle(int N) {
    	int col = 0;
    	int row = 0;
    	while (col <= N) {
    		while (row <= col) {
    			System.out.print("*");
    			row += 1;
    		}
    		System.out.println();
    		col += 1;
    		row = 0;
   }
}

   public static void main(String[] args) {
        drawTriangle(20);
   }
}