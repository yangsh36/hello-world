public class maxDog {
	public static void main(String[] args) {
		Dog d1 = new Dog(20);
		Dog d2 = new Dog(100);
		/*Dog bigger1 = Dog.maxDog(d1, d2);*/
		Dog bigger2 = d1.maxDog(d2);
		/*judge themselves*/

		/*bigger1.makeNoise();*/
		bigger2.makeNoise();
		System.out.println(bigger2.binomen);
	}
}