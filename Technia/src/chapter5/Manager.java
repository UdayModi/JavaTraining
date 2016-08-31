package chapter5;

public class Manager extends Employee{

	public Manager() {
		super();
	}

	public Manager(String name, float basicSal) {
		super(name, basicSal);
	}
	void test() {
		System.out.println("test from manager");
	}
}
