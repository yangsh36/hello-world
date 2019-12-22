public class BottleLoop {
    public static void main(String[] args) {
    	int bottles = 90;
        while (bottles > 0) {
        	System.out.println(bottles + " bottles of beer on the wall.");
        	bottles -= 1;
        }
    }
}
