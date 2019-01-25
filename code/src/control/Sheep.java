package control;

import java.util.Random;

public class Sheep extends Animal{
	
	public static double LOSSENERGY = 0.01;
	
	public Sheep(double energy, int speed, int currentRow, int currentCol, World world) {
		this.energy = energy;
		this.speed = speed;
		this.currentRow = currentRow;
		this.currentCol = currentCol;
		this.world = world;
		this.rand = new Random();
		this.iMale = rand.nextBoolean();
	}
	
	public Object move(Object o) {
		// TODO Auto-generated method stub
		currentRow += rand.nextInt(2*speed+1)-speed;
		currentCol += rand.nextInt(2*speed+1)-speed;
		
		if(currentRow >= world.nRow) {
			currentRow -= world.nRow;
		}
		if(currentCol >= world.nCol) {
			currentCol -= world.nCol;
		}
		if(currentRow < 0) {
			currentRow += world.nRow;
		}
		if(currentCol < 0) {
			currentCol += world.nCol;
		}
		energy -= LOSSENERGY*speed;
		return null;
	}
	
	
	
	public void run() {
		while(true) {
			move(new Object());
			try {
				Thread.sleep(World.TIME_STEP);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
