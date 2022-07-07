package main.java.com.paint;

import java.util.Scanner;

public class PaintApp {

	public static void main(String[] args) {
		
		Canvas canvas = null;
		Scanner scanner = new Scanner(System.in);
		Boolean quit = false;
		
		System.out.print("Enter command: ");
		
		while (!quit) {
			String command = scanner.nextLine();

			String[] parts = command.split(" ");
			
			if (command.startsWith("C")) {
				try {
					int width = Integer.parseInt(parts[1]);
					int height = Integer.parseInt(parts[2]);
					canvas = new Canvas(width, height);
					canvas.displayCanvas();
					//System.out.print(canvas.toString());
					String s = "-------\n|     |\n|     |\n|     |\n|     |\n|     |\n-------";
					String s2 = canvas.toString();
					System.out.println(s2.equals(s2));
				} catch (Exception e) {
					System.out.print("Enter a correct command");
				}
				
			} else if (command.startsWith("L")) {
				if (canvas == null) {
					System.out.print("You need to create a canvas first");
					break;
				}
				try {
					int x1 = Integer.parseInt(parts[1]);
					int y1 = Integer.parseInt(parts[2]);
					int x2 = Integer.parseInt(parts[3]);
					int y2 = Integer.parseInt(parts[4]);
					
					canvas.drawLine(x1, y1, x2, y2);
					canvas.displayCanvas();
				} catch (Exception e) {
					System.out.print("Enter a correct command");
				}

			} else if (command.startsWith("R")) {
				if (canvas == null) {
					System.out.print("You need to create a canvas first");
					break;
				}
				try {
					int x1 = Integer.parseInt(parts[1]);
					int y1 = Integer.parseInt(parts[2]);
					int x2 = Integer.parseInt(parts[3]);
					int y2 = Integer.parseInt(parts[4]);
					canvas.drawRectangle(x1, y1, x2, y2);
					canvas.displayCanvas();
				} catch (Exception e) {
					System.out.print("Enter a correct command");
				}
			} else if (command.startsWith("Q")) {
				quit = true;
				break;
			} else {
				System.out.print("Not a valid command");
			}
			
			System.out.println("Enter command: ");
		}
	}
}
