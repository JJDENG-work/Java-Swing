package gks;

import java.util.Scanner;

public class Num {

	public static void main(String[] args) {
		while (true) {
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			int M=fbnq(num);
			System.out.println("斐波那契第"+num+"项是："+M);
		}
	}
	public static int fbnq(int num) {
		int M = 0;
		if (num == 1 || num == 2) {
			M = 1;
		} else {
			M = fbnq(num - 1) + fbnq(num - 2);
		}
		return M;
	}

}
