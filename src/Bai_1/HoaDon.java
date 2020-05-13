/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_1;

import java.util.ArrayList;

/**
 *
 * @author Con Meo Cutee
 */
public class HoaDon 
{
    HoaDonHeader header;
    ArrayList<CTHD> list;

    protected HoaDon(Creater creater) 
    {
        this.header = creater.header;
        this.list = creater.list;
    }

    @Override
    public String toString()
    {
        String string = header.toString();
        for(CTHD cthd : list) {
            string += cthd.toString();
        }
        return string;
    }
    
    public static class Creater 
    {
        HoaDonHeader header;
        ArrayList<CTHD> list;
        
        public Creater() 
        {
            this.list = new ArrayList<>();
        }
        
        public Creater setHeader(HoaDonHeader header) 
        {
            this.header = header;
            return this;
        }
        
        public Creater addListHD(CTHD ct) 
        {
            this.list.add(ct);
            return this;
        }
        
        public HoaDon build() 
        {
            return new HoaDon(this);
        }
    }
}
