
public class Dragon {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Stread("one"));
		Thread t3 = new Thread(new Stread("two"));
		Thread t2 = new Thread(new Stread("three"));
		t1.start();
		t2.start();
		t3.start();
		
	}

}
