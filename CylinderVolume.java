
/**
 * โปรแกรมคำนวณหาปริมาตรทรงกระบอก
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class CylinderVolume
{
    // instance variables - replace the example below with your own
    private Cylinder cylinder;

    public static void main(String[] args)
    {
        CylinderVolume cylinderVolume = new CylinderVolume();
        cylinderVolume.start();
    } // End main

    /**
     * Constructor for objects of class CylinderVolume
     */
    public CylinderVolume()
    {
        // initialise instance variables
        cylinder = new Cylinder();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void start()
    {
        describeProgram();
        getInput();
        displayOutput();
    } // End start

    private void describeProgram()
    {
        System.out.println(
            "โปรแกรมนี้คำนวณหาปริมาตรทรงกระบอกตามที่คุณป้อนเข้ามา");        
        //       System.out.println("เมท็อด describeProgram");
    } // End displyOutput

    private void getInput()
    {
        String radiusStr, heightStr;
        double radius, height;

        radiusStr = JOptionPane.showInputDialog(
            null, "รัศมี");
        heightStr = JOptionPane.showInputDialog(
            null, "ความสูง");
        radius = Double.parseDouble(radiusStr);
        height = Double.parseDouble(heightStr);

        cylinder.setRadius(radius);
        cylinder.setHeight(height);

        //        System.out.println("รัศมี = " + cylinder.getRadius());
        //        System.out.println("ความสูง = " + cylinder.getHeight());

        //        System.out.println("เมท็อด getInput");
    } // End getInput

    private void displayOutput()
    {
        //        System.out.println("เมท็อด displyOutput");
               DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("รัศมีรูปทรงกระบอก = " + df.format(cylinder.getRadius()));
        System.out.println("ความสูงรูปทรงกระบอก = " + df.format(cylinder.getHeight()));
        System.out.println("ปริมาตร = " + df.format(cylinder.getVolume()));
    } // End describeProgram
} // End class
