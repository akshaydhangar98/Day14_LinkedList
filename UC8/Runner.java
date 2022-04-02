package UC8;

public class Runner<T> {

//		 * @param args This is main method.
	
	public static void main(String[] args) {
		LinkedList<Integer> obj = new LinkedList<Integer>();
		obj.add(56);
		obj.add(70);
		obj.addAtIndex(1, 30);
		obj.findNodeAddData(30, 40);
		obj.show();
	}
}

