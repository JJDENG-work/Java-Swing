package gks;

public class App extends R{


	public static void main(String[] args) {
		System.out.println(R.boy_filePath);
		System.out.println(R.girl_filePath);
		
		for(int row=0; row<R.array2d.length; row++){
			for (int m=0; m < R.array2d[row].length; m++) {
				System.out.print(R.array2d[row][m]+" ");
			}
			System.out.println();
		}

	}

}
