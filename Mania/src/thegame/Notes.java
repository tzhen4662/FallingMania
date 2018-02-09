package thegame;

public class Notes {
	private int notesX;
	private int notesY;
	boolean hit = false;
	
	public Notes(int x, int y)
	{
		this.notesX = x;
		this.notesY = y;
	}
	
	public int getX()
	{
		return this.notesX;
	}
	
	public int getY()
	{
		return this.notesY;
	}
	
	public int setX(int x)
	{
		return this.notesX = x;
	}
	
	public int setY(int y)
	{
		return this.notesY = y;
	}
	
	public boolean isHit()
	{
		return this.hit;
	}
}
