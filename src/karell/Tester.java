package karell;

	import kareltherobot.*;

	// This robot task is from page 11 in the text
	public class Tester implements Directions
{
		public void turnRight()
		{
				turnLeft();
				turnLeft();
				turnLeft();
		}
		    public static void main(String[] args)
		    {
		        // World file (leave out the readWorld line if you just want a blank world)
		        World.readWorld("WorldFiles/fig2-9.kwld");
		        World.setVisible(true);
		        
		        UrRobot karel = new UrRobot(1,2,East,1);
		        // Your instructions to complete this task should 
		        karel.move();
		        karel.turnLeft();
		        karel.turnLeft();
		    }


}
