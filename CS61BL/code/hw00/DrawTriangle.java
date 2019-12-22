public class DrawTriangle {
    public static void main(String[] args) {
    	int col = 0;
    	int row = 0;
    	int size = 5;
    	while (col <= size) {
    		while (row <= col) {
    			System.out.print("*");
    			row += 1;
    		}
    		System.out.println();
    		col += 1;
    		row = 0;
    	}
    }
}


/*
col = col + 1;
int col = 0;
int row = 0;
int SIZE = 5;
row = row + 1;
System.out.print('*');
System.out.println('*');
System.out.println();
while (col <= row) {
while (col < row) {
while (row < SIZE) {
while (row <= SIZE) {
}
*/