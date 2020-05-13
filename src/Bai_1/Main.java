/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_1;

/**
 *
 * @author Con Meo Cutee
 */
public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        HoaDon hoadon1 = new HoaDon.Creater().setHeader(new HoaDonHeader("HD001", "11/05/2020", "Tran Thi Nha Sinh"))
        .addListHD(new CTHD("Banh Mi Ngot", 2, 15000, 0.5f))
        .addListHD(new CTHD("Kem Orio", 1, 20000, 0.5f))
        .build();
        
        HoaDon hoadon2 = new HoaDon.Creater().setHeader(new HoaDonHeader("HD002", "05/05/2020", "Nguyen Ngoc Y Nhi"))
        .addListHD(new CTHD("Coca Cola", 1, 10000, 0.5f))
        .addListHD(new CTHD("Pepsi", 1, 10000, 0.5f))
        .build();
        
        HoaDon hoadon3 = new HoaDon.Creater().setHeader(new HoaDonHeader("HD003", "03/05/2020", "Le Thi Kiem Diem"))
        .addListHD(new CTHD("Giay An", 10, 5000, 0.5f))
        .addListHD(new CTHD("Khan tay", 1, 30000, 0.5f))
        .build();
        
        System.out.println(hoadon1.toString());
        System.out.println(hoadon2.toString());
        System.out.println(hoadon3.toString());
    }
}
