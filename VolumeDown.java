import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VolumeDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VolumeDown extends Actor
{
    private GreenfootImage VolumeDownImage = new GreenfootImage ("-", 32, Color.WHITE,Color.BLACK);
    
    public VolumeDown(){
        setImage(VolumeDownImage);
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
            if (averageVolume > 0)
            {
                averageVolume -= 2;
                music.setVolume(averageVolume);
                world.setAverageVolume(averageVolume);
            }
        }
    }
}

