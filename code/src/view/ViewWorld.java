package view;

import control.World;

public class ViewWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World w = new World(5,5);
		for(int i = 0; i < w.nRow; i++) {
			for(int j = 0; j < w.nCol; j++)
				System.out.print(String.format("%.2f", w.getGrass(i, j))+"  ");
			System.out.println();
		}
	}

}
