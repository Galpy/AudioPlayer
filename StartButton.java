import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor
{
    private GreenfootImage play = new GreenfootImage ("▶", 25, Color.WHITE,Color.BLACK);
    private GreenfootImage pause = new GreenfootImage ("⏸", 25, Color.WHITE, Color.BLACK);
    
    public StartButton() {
        setImage(play);
    }
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkMouseClick();
    }    
    
    public void checkMouseClick() {
        if (Greenfoot.mouseClicked(this))
        {
            MyWorld world = (MyWorld) getWorld();
            GreenfootSound music = world.getMusic();
            if (music.isPlaying()) {
                music.pause();
                setImage(play);
            }
            else
            {
                setImage(pause);
                music.play();
            }
        }
    }
}
