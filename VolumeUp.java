import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VolumeUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VolumeUp extends Actor
{
    private int points = 0;
    private GreenfootImage VolumeUpImage = new GreenfootImage ("+", 32, Color.WHITE,Color.BLACK);
    
    public VolumeUp(){
        setImage(VolumeUpImage);
    }
    public void act() 
    {
        checkMouseClick();
    }
    
    public void checkMouseClick()
    {
        if (Greenfoot.mouseClicked(this))
        {
            MyWorld world = (MyWorld) getWorld();
            GreenfootSound music = world.getMusic();
            int averageVolume = world.getAverageVolume();
            if (averageVolume < 100)
            {
                averageVolume += 2;
                music.setVolume(averageVolume);
                world.setAverageVolume(averageVolume);
            }
        }
    }   
}
