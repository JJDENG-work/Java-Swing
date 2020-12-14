package gks;

import java.util.Scanner;


public class Year {

	public static void main(String[] args) {
		System.out.println("输入一个整数判断闰年：");
		while (true) {
			Scanner sc=new Scanner(System.in);
			int num = sc.nextInt();
			if (num<3200 && num>-3200) {
				if (num%4==0 && num%100!=0 || num%400==0) {
					System.out.println(num+" 年是闰年");
				}else {
					System.out.println(num+" 年不是闰年");
				}
			}else {
				System.out.println("请输入一个-3200到3200的数");
			}
			
		}
		
	}

}
