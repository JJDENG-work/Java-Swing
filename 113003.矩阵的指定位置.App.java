package gks;

import java.util.Scanner;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[][]=new int[10][10];
		
		Scanner scanner = new Scanner(System.in);
		int row=scanner.nextInt();
		int column=scanner.nextInt();
		int i=scanner.nextInt();
		
		array[row-1][column-1]=i;
		for(int a=0; a<array.length; a++){
			for (int b=0; b < array[row].length; b++) {
				System.out.print(array[a][b]+" ");
			}
			System.out.println();
		}

	}

}
