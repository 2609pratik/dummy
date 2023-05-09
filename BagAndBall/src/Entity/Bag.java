package Entity;

import java.util.ArrayList;

public class Bag {
	private ArrayList<Balls> ballsInBag ;
	private final byte CAPACITY = 12;
	private int redCount = 0; 
	private int greenCount = 0; 
	private int yellowCount = 0;
	Balls redBalls = new Balls(Colour.RED);
	Balls greenBalls = new Balls(Colour.GREEN);
	Balls yellowBalls = new Balls(Colour.YELLOW);

	public byte getCAPACITY() {
		return CAPACITY;
	}
	public void getBagInfo() {
		for (Balls obj : ballsInBag) {
		    System.out.print(obj.getColour()+ ", ");
		}
	    System.out.println();
	}
	public void setBagInfo(ArrayList<Balls> bagInfo) {
		this.ballsInBag = ballsInBag;
	}
	
	public Bag() {
		this.ballsInBag = new ArrayList<>();
		this.redCount = 0;
		this.greenCount = 0;
		this.yellowCount = 0;
	}
	public int getBagcount() {
		return redCount+greenCount+yellowCount;
	}
	public String addRed() {
		ballsInBag.add(redBalls);
		redCount++;
		return "red added";
		
	}
	public String addGreen() {
		greenCount++;
		if (greenCount<redCount) {
			ballsInBag.add(greenBalls);
			return "green added";
		}else {
			greenCount--;
			return "green not added";
		}
	}
	public String addYellow() {
		yellowCount++;
		float compare = (float) (0.4*getBagcount());
		if (yellowCount<compare) {
			ballsInBag.add(yellowBalls);
			return "yellow added";
		}else {
			yellowCount--;
		return "yellow not added";
		}
	}
	
	
		
}
