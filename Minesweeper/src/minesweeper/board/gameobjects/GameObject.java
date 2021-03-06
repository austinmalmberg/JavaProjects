package minesweeper.board.gameobjects;

public abstract class GameObject {

	// position
	protected int x;
	protected int y;
	
	// dimension
	protected int width;
	protected int height;
	
	protected boolean visible;
	
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	public void setWidth(int width) { this.width = width; }
	public void setHeight(int height) { this.height = height; }
	public void setVisible(boolean visible) { this.visible = visible; }
	
	public int getX() { return x; }
	public int getY() { return y; }
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	public boolean getVisible() { return visible; }
	
	public abstract void init();
	public abstract void update();
	public abstract void draw(java.awt.Graphics g);
	
	public abstract void mousePressed(java.awt.event.MouseEvent m);
	public abstract void mouseReleased(java.awt.event.MouseEvent m);
}
