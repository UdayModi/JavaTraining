package chapter5;

public class Demo {
	public static void main(String[] args) {
		Employee emp1=new Employee("xyz",1000);
		Employee emp2=new Employee();
		Employee mgr1=new Manager("qwerty",2000);
		Manager mgr2=new Manager();
	/*	Manager mgr3=(Manager)new Employee();  ClassCastException: Employee cant be cast to Manager */
		
		if(emp1 instanceof Object){
			System.out.println("emp1 is a instanceof Object");
		}
		if(emp1 instanceof Employee){
			System.out.println("emp1 is a instanceof Employee");
		}
		if(emp1 instanceof Manager){
			System.out.println("emp1 is a instanceof Manager");
		}
		if(mgr1 instanceof Employee){
			System.out.println("mgr1 is a instanceof Employee");
		}
		if(mgr1 instanceof Manager){
			System.out.println("mgr1 is a instanceof Manager");
		}
		if(mgr2 instanceof Employee){
			System.out.println("mgr2 is a inctanceof Employee");
		}
		if(mgr2 instanceof Manager){
			System.out.println("mgr2 is a instanceof Manager");
		}
		
		System.out.println(emp1.getBasicSal());
		System.out.println(emp2.getName());
		System.out.println(mgr1.getBasicSal());
		System.out.println(mgr2.getBasicSal());
		
	}
}
