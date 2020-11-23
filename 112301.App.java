package com.gks;

import java.util.Scanner;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		if(num.equals("a")){
			System.out.println("x"+(int)(Math.random()*100)+"y"+(int)(Math.random()*100));
		}


	}

}
