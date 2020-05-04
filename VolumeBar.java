import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VolumeBar here.
 * 
 * @Gregglee 
 * @version 5/4/2020
 */
public class VolumeBar extends Actor
{
    private int volume = 50;
    public VolumeBar() {
        drawBar();
    }
    /**
     * Act - do whatever the VolumeBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (((MyWorld)getWorld()).getAverageVolume() != volume)
        {
            volume = ((MyWorld)getWorld()).getAverageVolume();
            drawBar();
        }    
    }
    
    private void drawBar() {
        GreenfootImage image = new GreenfootImage(100,10);
        image.setColor(Color.BLUE);
        image.drawRect(0, 0, 100, 10);
        image.fillRect(0,0,100,10);

        setImage(image);
    }
        
}
