package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot MetalPython = new Robot();
	
	   // 5. Set your robot's pen to the down position
 MetalPython.penDown();
		// 3. Set the robot to go at max speed (10)
MetalPython.setSpeed(10);
	for (int j = 0; j <75; j++) {
		for (int i = 7; i < 75; i++) {
	MetalPython.move(5*i);
	MetalPython.setRandomPenColor();
	MetalPython.setPenWidth(i);
	MetalPython.turn(120);
}
	}

			// 7. Change the pen color to random
	
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	
			// 2. Turn the robot 1/3 of 360 degrees to the right
	
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i

	}
}
