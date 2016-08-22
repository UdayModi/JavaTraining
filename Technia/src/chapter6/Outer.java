package chapter6;

public class Outer {
	private int i=100;
	public void test(){
		int j=200;
		System.out.println("test method "+i+" "+j);
		class Inner{
			private int k=300;
			public void testInner(){
				i=10;
				System.out.println("Inside testInner "+ i+" "+j+" "+k);
			}
		}
		Inner i=new Inner();
		i.testInner();
	}

	public static void main(String[] args) {
		Outer o=new Outer();
		o.test();
	}
}
/**********OUTPUT***********
test method 100 200
Inside testInner 10 200 300
*/