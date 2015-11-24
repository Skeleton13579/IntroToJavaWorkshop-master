package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		Robot SkeleBone= new Robot();
		SkeleBone.penDown();
		for (int i = 0; i < 4; i++) {
		SkeleBone.turn(90);
		SkeleBone.move(100);	
		}
		
		
			
	
		
		
	}
}
