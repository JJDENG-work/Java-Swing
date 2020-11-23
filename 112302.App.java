package com.gks;

public class App {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		int arr[][] = {
				{12,12},
				{21,13},
				{45,882},
				{45,102}
				};
		//Scanner scanner = new Scanner(System.in);
		while (true) {
			Thread.sleep(1000);
			System.out.println("一秒过去了");
			//String num = scanner.next();
			int x = (int)(Math.random()*4);
			System.out.println(arr[x][0]+","+arr[x][1]);
		}
		
		
		}

	}
