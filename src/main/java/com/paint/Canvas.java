package main.java.com.paint;

import java.util.Arrays;

public class Canvas {
	
	private int width;
	private int height;
	int borderMargin = 2;

	private char[][] canvas;
	
	private char upperBorderChar = '-'; 
	private char sideBorderChar = '|';
	
	/**
	 * @param w = width = y coordinate on the axis
	 * @param h = height = x coordinate on the axis
	 */
	public Canvas(int w, int h) {
		this.width = w+borderMargin;
		this.height = h+borderMargin;
		
		this.canvas = new char[height][width];
		
		fillBorder();
	}
	
	public void fillBorder() {
		for(int i = 0; i<= height-1; i++) { 
			if ( i==0 || i == height-1) {
			  Arrays.fill(canvas[i], upperBorderChar); 
			} else { 
				canvas[i][0] = sideBorderChar;
				canvas[i][width-1] = sideBorderChar; 
			} 
		}
	}
	
	public void draw(int x1, int y1, int x2, int y2) {
		for(int i = x1; i<= x2; i++) { 
			for(int y = y1; y<= y2; y++) { 
				canvas[i][y] = 'x';
			}	
		}		
	}
	
	public void drawLine(int x1, int y1, int x2, int y2) {
		if (checkBorders(x1, y1, x2, y2) && checkLine(x1, y1, x2, y2)) {
			draw(x1, y1, x2, y2);
		}
	}
	
	public void drawRectangle(int x1, int y1, int x2, int y2) {
		if (checkBorders(x1, y1, x2, y2) && checkSquare(x1, y1, x2, y2)) {
			for(int i = x1; i<= x2; i++) { 
				for(int y = y1; y<= y2; y++) { 
					canvas[i][y] = 'x';
				}	
			}		
		}
	}
	
	public boolean checkBorders(int x1, int y1, int x2, int y2) {	
		if (x1==0 || y1 == 0 || x2 > height-1 || y2 > width-1 ) {
			System.out.println("X and Y are not within borders");
			return false;
		} else {
			return true;
		}
	}
	
	public boolean checkLine(int x1, int y1, int x2, int y2) {
		if (x1 != x2 && y1 != y2 ) {
			System.out.println("Not a line. Line should be either horizontal or vertical");
			return false;
		} else {
			return true;
		}
	}

	public boolean checkSquare(int x1, int y1, int x2, int y2) {
		if (x1 != x2 && y1 != y2 ) {
			return true;
		} else {
			System.out.println("Not a rectangle");
			return false;
		}
	}
	
	public void displayCanvas() {
		for(int i = 0; i<= height-1; i++) { 
			for(int y = 0; y<=width-1; y++) {
				  System.out.print(canvas[i][y]);
			}
			System.out.print("\n");
		}
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public char[][] getCanvas() {
		return canvas;
	}

	public void setCanvas(char[][] canvas) {
		this.canvas = canvas;
	}
	
}
