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
public class ShapeFactory 
{
    public Shape createShape(ShapeType shapeType) 
    {
        if (null != shapeType) switch (shapeType) 
        {
            case Rectangle:
                return Rectangle.createRectangle();
            case Triangle:
                return Triangle.createTriangle();
            case Circle:
                return Circle.createCircle();
            default:
                break;
        }
        return null;
    }
}
