package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	
		//2. create an array of 5 robots.
	Robot[] robot = new Robot[5];
		//3. use a for loop to initialize the robots.
	for (int i = 0; i < robot.length; i++) {
		robot[i]=new Robot();
	}
			//4. make each robot start at the bottom of the screen, side by side, facing up
robot[0].moveTo(50, 550);
robot[1].moveTo(150, 550);
robot[2].moveTo(250, 550);
robot[3].moveTo(350, 550);
robot[4].moveTo(450, 550);
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
   
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
boolean finished=false;
while(!finished) {
 	for (int i = 0; i < robot.length; i++) {
	Random random = new Random();
		random.nextInt(50);
		robot[i].move(i);
		if(robot[i].getY()==0) {
 		finished=true;
 		robot[i].sparkle();
 		System.out.println("You are the winner!");
 		
 	}
 	}
}
	}
}
		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

