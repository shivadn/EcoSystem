package control;

import java.util.Random;

public class Animal extends Thread implements IAnimal{

	protected double energy;
	protected boolean iMale;
	protected int speed;
	protected World world;
	public int getCurrentRow() {
		return currentRow;
	}

	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}

	public int getCurrentCol() {
		return currentCol;
	}

	public void setCurrentCol(int currentCol) {
		this.currentCol = currentCol;
	}

	protected int currentRow, currentCol;
	protected Random rand;
	
	@Override
	public Object eat(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object move(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object die(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object mate(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}
