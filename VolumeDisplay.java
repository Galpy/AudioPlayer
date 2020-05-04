import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VolumeDisplay here.
 * 
 * @GreggLee
 * @version 5/4/2020
 */
public class VolumeDisplay extends Actor
{
    private int volume = 50;
    public VolumeDisplay(){
        drawVolumeDisplay();
    }
    public void act()
    {
        MyWorld world = (MyWorld) getWorld();
        if (world.getAverageVolume() != volume)
        {
            volume = world.getAverageVolume();
            drawVolumeDisplay();
        }
    }
    
    public void drawVolumeDisplay() {
        setImage(new GreenfootImage("" + volume, 20, Color.WHITE, Color.BLACK));
    }
}
