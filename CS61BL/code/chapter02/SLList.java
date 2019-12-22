public class SLList {

	/* static classes cannot access outer class's 
	   instance variables or methods. */
	private static class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}
	}

	/* the first item (if it exist), is a sentinel.next */
	private IntNode sentinel;
	private int size;

	/* create empty list */
	public SLList() {
		sentinel = new IntNode(0, null);
		size = 0;
	}

	public SLList(int x) {
		sentinel = new IntNode(0, null);
		sentinel.next = new IntNode(x, null);
		size = 1;
	}

	public void addFirst(int x) {
		sentinel.next = new IntNode(x, sentinel.next);
		size += 1;
	}

	public int getFirst() {
		return sentinel.next.item;
	}

	public void addLast(int x) {
		size += 1;

		IntNode p = sentinel;
		while (p.next != null) {
			p = p.next;
		}
		p.next = new IntNode(x, null);
	}

	/*
	private static int size(IntNode p) {
		if (p.next == null) {
			return 1;
		}
		return 1 + size(p.next);
	}
	*/

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		SLList L = new SLList(10);
		L.addFirst(5);
		L.addFirst(15);
		L.addLast(20);
		System.out.println(L.getFirst());
		System.out.println(L.size());
		SLList I = new SLList();
		I.addLast(12);
		I.addLast(6);
		System.out.println(I.size());
	}
}

