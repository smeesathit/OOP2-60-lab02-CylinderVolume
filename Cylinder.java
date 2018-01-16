
/**
 * Write a description of class Cylinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cylinder
{
    // class variable
    private static final double PI = 3.1416;
    // instance variables - replace the example below with your own
    private double radius;
    private double height;

    /**
     * Constructor for objects of class Cylinder
     */
    public Cylinder()
    {
        // initialise instance variables
        radius = 0.0;
        height = 0.0;
    } // End constructor

    /**
     * set mothods
     */
    public void setRadius(double r)
    {
        radius = r;
    } // End setRadius

    public void setHeight(double h)
    {
        height = h;
    } // End setHeight

    /**
     * get mothods
     */
    public double getRadius()
    {
        return radius;
    }// End getRadius

    public double getHeight()
    {
        return height;
    } // End getHeight
    
    /**
     * คำนวณปริมาตร
     */
    public double getVolume()
    {
        double volume;
        
        volume = PI * (radius * radius) * height;
        
        return volume;
    }
} // End class
