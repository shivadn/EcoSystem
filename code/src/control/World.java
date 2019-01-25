package control;

import java.util.Random;

public class World {
	public int nRow;
	public int nCol;
	private double[][] grass;
	
	public World() {
		nRow = 10;
		nCol = 10;
		Random rand = new Random();
		grass = new double[nRow][nCol];
		
		for(int i = 0; i < nRow; i++)
			for(int j = 0; j < nCol; j++)
				grass[i][j] = rand.nextDouble();
	}
	
	public World(int row, int col) {
		nRow = row;
		nCol = col;
		Random rand = new Random();
		grass = new double[nRow][nCol];
		
		for(int i = 0; i < nRow; i++)
			for(int j = 0; j < nCol; j++)
				grass[i][j] = rand.nextDouble();
	}
	
	public void traverse() {
		for(int i = 0; i < nRow; i++) {
			for(int j = 0; j < nCol; j++)
				System.out.print(grass[i][j]+"  ");
			System.out.println();
		}

	}
	
	public double getGrass(int row, int col) {
		return grass[row][col];
	}
	
}
