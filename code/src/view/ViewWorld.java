package view;

import control.Animal;
import control.Sheep;
import control.World;

public class ViewWorld{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World w = new World(5,5);
		Animal animal = new Sheep(10, 1, 0, 0, w);
		w.animal = animal;
		animal.start();
		w.start();

		while(true) {
			double[][] view = new double[w.nRow][w.nCol];
			
			for(int i = 0; i < w.nRow; i++) {
				for(int j = 0; j < w.nCol; j++)
					view[i][j] = w.getGrass(i, j);
			}
			
			view[animal.getCurrentRow()][animal.getCurrentCol()] = 2;
			
			for(int i = 0; i < w.nRow; i++) {
				for(int j = 0; j < w.nCol; j++)
					System.out.print(String.format("%.2f", view[i][j])+"  ");
				System.out.println();
			}
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
