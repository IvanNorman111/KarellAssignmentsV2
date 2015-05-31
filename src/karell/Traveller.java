package karell;

import kareltherobot.*;
// this is assignment 3a
public class Traveller extends UrRobot
{
    public Traveller(int street, int avenue, Direction direction, int beepers)
    {
        super(street, avenue, direction, beepers);
    }
    
    public void moveMile()
    {
        // remembering that a mile is 8 blocks long
    }
    
    public void moveBackward()
    {
        // which moves Karel one block backward, but leaves it facing the same direction
    }
    
    public void moveKiloMile()
    {
        // which moves Karel 1000 miles forward – use your brain, NOT brute force!
        // you will probably want to include some additional methods in order to do this
    }

    public static void main(String[] args)
    {
        World.setVisible(true);
        World.setDelay(50);
        
        Traveller karel = new Traveller(2,2,East,0);
        // you can uncomment the instructions below if you want to test them
        //karel.moveBackward();
        //karel.moveMile();
        //karel.moveKiloMile();
        
    }

}