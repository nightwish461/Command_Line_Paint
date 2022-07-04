package test.java.com.paint;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.paint.Canvas;

public class TestPaintApp {
	
	Canvas canvas;
	
	@BeforeEach
	public void init() {
		canvas = new Canvas(5, 10);
	}
	
	/*
	 * Positive test with points inside canvas border.
	 */
	@Test
	public void testPointsWithinBorder() {
		assertEquals(true, canvas.checkBorders(2, 3, 4, 5));
	}
	
	/*
	 * Negative test with points outside canvas border.
	 */
	@Test
	public void testPointsOutsideBorder() {
		assertEquals(false, canvas.checkBorders(6, 3, 5, 7));
	}
	
	@Test
	public void testCheckLine() {
		assertEquals(true, canvas.checkLine(2, 3, 2, 5));
	}
	
	@Test
	public void testCheckNotALine() {	
		assertEquals(false, canvas.checkLine(2, 3, 4, 5));
	}
	
	@Test
	public void testCheckSquare() {
		assertEquals(true, canvas.checkSquare(2, 2, 4, 4));
	}
	
	@Test
	public void testCheckNotASquare() {
		assertEquals(false, canvas.checkSquare(2, 8, 2, 5));
	}
}
