package chapter5;

public class Employee {
	//private int id;
	private String name;
	protected float basicSal;
	
	public Employee() {
		this.name="abc";
		this.basicSal=1000.0f;
	}
	public Employee(String name, float basicSal) {
		this.name = name;
		this.basicSal = basicSal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(float basicSal) {
		this.basicSal = basicSal;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.name.equals(((Employee)obj).name)){
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return this.name.charAt(0);
	}
	void test(){
		System.out.println("test from employee");
	}
}
