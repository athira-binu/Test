package package1;

public class Access1 {
	int a;
	public int b;
	protected int c;
	private int d;
	public void method1() {
		System.out.println("Public method");
	}
	protected void method2() {
		System.out.println("Protected method");
	}
	private void method3() {
		System.out.println("Private method");
	}
	void method4() {
		System.out.println("Default method");
	}

	/*public static void main(String[] args) {
		Access1 a1 = new Access1();
		a1.method1();
		a1.method2();
		a1.method3();
		a1.method4();
	}*/

}
