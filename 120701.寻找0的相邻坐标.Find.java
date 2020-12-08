package com;

public class Find {
	public int X;
	public int Y;

	public void name(int arrar2d[][]) {
		X=arrar2d[0].length;
		Y=arrar2d.length;
		for (int row = 0; row < arrar2d.length; row++) {
			for (int column = 0; column < arrar2d[0].length; column++) {
				if (arrar2d[row][column]==0) {
					System.out.println("行："+row+"列："+column);
					FindUp(row, column);
					FindLeft(row, column);
					FindRight(row, column);
					FindDown(row, column);
				}
			}
		}
	}
	
		public void FindUp(int x, int y) {
			if (x-1<0) {
				System.out.println("R_up("+x+"+"+y+")");
			}else {
				System.out.println("R_up("+(x-1)+","+y+")");
			}
		}
		public void FindLeft(int x, int y) {
			if (y-1<0) {
				System.out.println("R_left("+x+"+"+y+")");
			}else {
				System.out.println("R_left("+x+","+(y-1)+")");
			}
		}
		public void FindDown(int x, int y) {
			if (x+1>X) {
				System.out.println("R_down("+x+","+y+")");
			}else {
				System.out.println("R_down("+(x+1)+","+y+")");
			}
	}
		public void FindRight(int x, int y) {
			if (x+1>Y) {
				System.out.println("R_down("+x+","+y+")");
			}else {
				System.out.println("R_down("+x+","+(y+1)+")");
			}
	}
		
}
