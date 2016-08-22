package assignment3;

enum CoffeeSize
{
	BIG(20),HUGE(25),OVERWHELMING(50);
	private int m1;
	private CoffeeSize(int m) {
		
		m1=m;
	}
	int getM1(){
		return m1;
	}
}