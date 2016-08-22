package assignment3;

public class CoffeeTest {
	CoffeeSize size;
	public static void main(String[] args) {
		CoffeeTest drink=new CoffeeTest();
		drink.size=CoffeeSize.BIG;
		System.out.println(drink.size);
		drink.size=CoffeeSize.HUGE;
		System.out.println(drink.size);
		System.out.println("Coffee is "+" "+drink.size.getM1());
	}
}
/**OUTPUT**
BIG
HUGE
Coffee is  25*/