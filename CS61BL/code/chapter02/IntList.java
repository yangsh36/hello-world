public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	public int size() {
		/* use recursion */
		if (rest == null) {
			return 1;
		}
		else {
			return this.rest.size() + 1;
		}
	}

	public int iterativeSize() {
		/* use no recursion */
		IntList p = this;
		int totalSize = 0;
		while (p != null) {
			totalSize += 1;
			p = p.rest;
		}
		return totalSize;
	}

	public int get(int i) {
		if (i == 0) {
			return first;
		}
		else {
			return rest.get(i - 1);
		}
	}

	public int totalsum() {
		int d = 0;
		int total = 0;
		while (d < this.size()) {
			total += this.get(d);
			d += 1;
		}
		return total;
	}

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);
		L = new IntList(20, L);

		System.out.println(L.size());
		System.out.println(L.iterativeSize());
		System.out.println(L.get(0) + L.get(1) + L.get(2));
		System.out.println(L.totalsum());

	}

}


/*
List is going to be able to grow arbitrarily large.
*/