package control;

import java.util.Random;

public class World extends Thread{
	public int nRow;
	public int nCol;
	private double[][] grass;
	private double grassGrowthSpeed = 0.1;
	public static long TIME_STEP = 1000;
	public Animal animal;
	private Random rand;
	
	public World() {
		nRow = 10;
		nCol = 10;
		rand = new Random();
		grass = new double[nRow][nCol];
		
		for(int i = 0; i < nRow; i++)
			for(int j = 0; j < nCol; j++)
				grass[i][j] = rand.nextDouble();
	}
	
	public World(int row, int col) {
		nRow = row;
		nCol = col;
		grass = new double[nRow][nCol];
		rand = new Random();
		
		for(int i = 0; i < nRow; i++)
			for(int j = 0; j < nCol; j++)
				grass[i][j] = rand.nextDouble();
	}
	
	public double getGrass(int row, int col) {
		return grass[row][col];
	}
	
	public void run() {
		rand = new Random();
		while(true) {
			grow();
			try {
				Thread.sleep(World.TIME_STEP);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	private void grow() {
		for(int i = 0; i < nRow; i++) {
			for(int j = 0;j < nCol; j++) {
				grass[i][j] += rand.nextDouble()*grassGrowthSpeed;
				grass[i][j] = (grass[i][j] > 1)? 1: grass[i][j];
			}
		}
	}
	
}
	

