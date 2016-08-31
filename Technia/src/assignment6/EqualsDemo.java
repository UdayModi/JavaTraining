package assignment6;

import chapter5.Employee;

public class EqualsDemo {

	public static void main(String[] args) {

		Employee emp=new Employee("abc", 100000);
		Employee emp2=new Employee("abc", 100000);
		Employee emp3=emp;
		System.out.println(emp.equals(emp2));
		System.out.println(emp==emp2); //false
		System.out.println(emp2.equals(emp3));
		System.out.println(emp.equals(emp3));
		System.out.println(emp==emp3); //true
		System.out.println("emp hascode: "+emp.hashCode());
		System.out.println("emp2 hascode: "+emp2.hashCode());
		System.out.println("emp3 hascode: "+emp3.hashCode());
	}
}

/*Before overriding equals()&&hashcode()  After overriding
/*OUTPUT is 							
false										true
false										false
false										true
true										true
true										true
emp hascode: 2018699554						emp hascode: 97
emp2 hascode: 1311053135					emp2 hascode: 97
emp3 hascode: 2018699554					emp3 hascode: 97
 */