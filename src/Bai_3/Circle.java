/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3;

/**
 *
 * @author Con Meo Cutee
 */
public class Circle extends Shape 
{
    private static Shape circle;

    protected Circle(String brush, String frame, String paper) 
    {
        super(brush, paper, frame);
    }
    
    public static Shape createCircle() 
    {
        if(circle == null)
            circle = new Circle("Brush", "Paper", "Circle-Frame");
        return circle;
    }

    @Override
    public String draw() 
    {
        return "Draw Circle:     " + getBrush() + " + " + getPaper() + " + " + getFrame();
    }
}
