import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CurrentVolumeBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CurrentVolumeBar extends Actor
{
    private int yvalue = 0;
    public CurrentVolumeBar(){
        drawImage();
    }
    /**
     * Act - do whatever the CurrentVolumeBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        updateImage();
    }
    
    public void drawImage(){
        GreenfootImage image = new GreenfootImage(10,10);
        image.setColor(Color.WHITE);
        image.drawRect(0, 0, 10,10);
        image.fillRect(0,0,10,10);
        
        setImage(image);
    }
    
    public void updateImage()
    {
        MyWorld world = (MyWorld) getWorld();
        if (Greenfoot.mouseClicked(world.getVolumeUp()))
        {
            if (world.getAverageVolume() < 100)
            {
                GreenfootImage image = getImage();
                setLocation(getX() + 2, getY());
        
                setImage(image);
            }
        }
        if (Greenfoot.mouseClicked(world.getVolumeDown()))
        {
            if (world.getAverageVolume() > 0)
            {
                GreenfootImage image = getImage();
                setLocation(getX() - 2, getY());
            
                setImage(image);
            }
        }
    }
}
