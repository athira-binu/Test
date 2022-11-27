package package2;

import package1.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {
		Access3 a3 = new Access3();
		a3.method1();
		a3.method2();
		//a3.method3();//private method
		//a3.method4();//default method
		

	}

}
