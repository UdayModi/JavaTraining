package assignment2;

import java.util.Scanner;

public class AddTest {
	int result=0;
	int add(int... numbers){
		for(int num: numbers){
			result+=num;
		}
		return result;
	}
	int add(int num1,int num2){
		return result=num1+num2;
	}
	public static void main(String[] args) {
		AddTest at=new AddTest();
		System.out.println("Addition is "+at.add(10,20,30));
		/*Scanner in=new Scanner(System.in);
		in.nextLine();*/
		System.out.println("Addition is "+at.add(10,20));
	}
}
/***OUTPUT***
Addition is 60
Addition is 30
*/