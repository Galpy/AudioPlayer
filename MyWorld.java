import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private GreenfootSound music = new GreenfootSound("CountryRoads.mp3");
    private int averageVolume;
    private VolumeUp volumeup = new VolumeUp();
    private VolumeDown volumedown = new VolumeDown();
    private VolumeBar volumebar = new VolumeBar();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(200, 100, 1); 
        setUp();
    }
    
    public void setUp()
    {
        averageVolume = 50;
        music.setVolume(averageVolume);
        
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);
        background.fill();
        
        addObject(new StartButton(), 30, getHeight()/2);
        
        addObject(volumeup, 30 , getHeight()/2 - 25);

        addObject(volumedown, 30, getHeight()/2 + 25);
        
        addObject(new VolumeDisplay(), 140 , 25);
        
        addObject(volumebar, 140, getHeight()/2);
        
        addObject(new CurrentVolumeBar(),140, getHeight()/2);
    }
    
    public GreenfootSound getMusic()
    {
        return music;
    }
    
    public void setMusic(GreenfootSound music)
    {
        this.music = music;
    }
    
    public int getAverageVolume()
    {
        return averageVolume;
    }
    
    public void setAverageVolume(int averageVolume)
    {
        this.averageVolume = averageVolume;
    }

    public VolumeUp getVolumeUp()
    {
        return volumeup;
    }
    
    public VolumeDown getVolumeDown()
    {
        return volumedown;
    }
    
    public VolumeBar getVolumeBar()
    {
        return volumebar;
    }
}
