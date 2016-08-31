package com.technia.chapter7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultiCatchDemo {
	public static void main(String[] args) {

		try {
			System.out.println("arg is "+args[0]);
			FileInputStream fis= new FileInputStream("D:\\TechniaTraining\\Technia\\src\\chapter5\\Demo.java");
		} catch (FileNotFoundException | ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
	}
}