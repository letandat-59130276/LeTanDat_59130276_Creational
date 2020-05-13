/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_2;

/**
 *
 * @author Con Meo Cutee
 */
  
public class Main {
    public static void main(String[] args) {

        MyStringBuilder myStringBuilder = new MyStringBuilder("Le Tan")
        .addString(" Dat")
        .addString(" 59.CNTT-2 ")
        .addFloat(10f)
        .addBoolean(true);
        
        System.out.println(myStringBuilder.toString());
    }
}
