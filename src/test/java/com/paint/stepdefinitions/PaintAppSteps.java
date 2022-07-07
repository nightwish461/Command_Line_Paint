package test.java.com.paint.stepdefinitions;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.java.com.paint.Canvas;
import main.java.com.paint.PaintApp;

public class PaintAppSteps {
	
	Canvas canvas;
	String s = "-------\n|     |\n|     |\n|     |\n|     |\n|     |\n-------";
	
	@Given("the programm has started")
	public void the_programm_has_started() {
	    PaintApp paintApp = new PaintApp();
	}

	@When("a canvas is created with the command {string}")
	public void a_canvas_is_created_with_the_command(String string) 
	{
		try {
			String[] parts = string.split(" ");
			int width = Integer.parseInt(parts[1]);
			int height = Integer.parseInt(parts[2]);
			canvas = new Canvas(width, height);
		} catch (Exception e) {
			System.out.print("Enter a correct command");
		}
	}

	@Then("expected canvas is {string}")
	public void expected_canvas_is(String string) {
	    Assertions.assertEquals(string, s);
	}

	@Given("a line is drawn with the command {string}")
	public void a_line_is_drawn_with_the_command(String string) {
		try {
			String[] parts = string.split(" ");
			int x1 = Integer.parseInt(parts[1]);
			int y1 = Integer.parseInt(parts[2]);
			int x2 = Integer.parseInt(parts[3]);
			int y2 = Integer.parseInt(parts[4]);
			canvas.drawLine(x1, y1, x2, y2);
		} catch (Exception e) {
			System.out.print("Enter a correct command");
		}
	}
	
	@When("a rectangle is drawn with the command {string}")
	public void a_rectangle_is_drawn_with_the_command(String string) {
		try {
			String[] parts = string.split(" ");
			int x1 = Integer.parseInt(parts[1]);
			int y1 = Integer.parseInt(parts[2]);
			int x2 = Integer.parseInt(parts[3]);
			int y2 = Integer.parseInt(parts[4]);
			canvas.drawRectangle(x1, y1, x2, y2);
		} catch (Exception e) {
			System.out.print("Enter a correct command");
		}
	}
}
