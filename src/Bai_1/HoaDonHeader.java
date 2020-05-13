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
public class HoaDonHeader 
{
    String maHD, ngayBan, tenKhachHang;

    public HoaDonHeader(String maHD, String ngayBan, String tenKhachHang)
    {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKhachHang = tenKhachHang;
    }
    
    @Override
    public String toString()
    {
        return "Ma hoa don:  " + maHD + " _ Ngay ban: " + ngayBan + " _ Ten khach hang: " + tenKhachHang + "\n";
    }
}
