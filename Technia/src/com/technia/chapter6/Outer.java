package com.technia.chapter6;

public class Outer {
	private int i=100;
	public void test(){
		int i=200;
		System.out.println("Inside test method: local variable i= "+i+" Outer class instance variable i= "+this.i);
		class Inner{
			private int i=300;
			public void testInner(){
				System.out.println("Inside testInner method: local i= "+ this.i+" "+i+" "+new Outer().i);
			}
		}
		Inner in=new Inner();
		in.testInner();
	}

	public static void main(String[] args) {
		Outer o=new Outer();
		o.test();
	}
}
