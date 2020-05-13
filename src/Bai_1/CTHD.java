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
public class CTHD 
{
    String sanPham;
    int soLuong;
    double donGia;
    float chietKhau;

    public CTHD(String sanPham, int soLuong, double donGia, float chietKhau)
    {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString()
    {
        return "San pham:    " + sanPham + " _ So luong: " + soLuong + " _ Don gia: " + donGia + " _ Chiet khau: " + chietKhau + "\n";
    }
}
