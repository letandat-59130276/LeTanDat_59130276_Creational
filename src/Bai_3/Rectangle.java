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
public class Rectangle extends Shape 
{
    private static Shape rectangle;

    protected Rectangle(String brush, String frame, String paper) 
    {
        super(brush, paper, frame);
    }
    
    public static Shape createRectangle() 
    {
        if(rectangle == null)
            rectangle = new Rectangle("Brush", "Paper", "Rectangle-Frame");
        return rectangle;
    }

    @Override
    public String draw() 
    {
        return "Draw Rectangle:  " + getBrush() + " + " + getPaper() + " + " + getFrame();
    }
}
