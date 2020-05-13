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
public class Main 
{
    public static void main(String[] args) 
    {
        ShapeFactory sf = new ShapeFactory();
        
        Shape SR = sf.createShape(ShapeType.Rectangle);
        Shape SC = sf.createShape(ShapeType.Circle);
        Shape ST = sf.createShape(ShapeType.Triangle);

        System.out.println(SR.draw());
        System.out.println(SC.draw());
        System.out.println(ST.draw());
    }
}

