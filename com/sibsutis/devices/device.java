package com.sibsutis.devices;
import com.sibsutis.*;
public abstract class device implements Printable{
    protected int id;
    protected int price;
    protected String ip;

    public device(int id, int price, String ip){
        this.id=id;
        this.price=price;
        this.ip=ip;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip){
        this.ip=ip;
    }
    public abstract String getDeviceType();

    // @Override
    //   public String printDevice(){
    //         return String.format("%d,%d,%s"+getDeviceType(),id,price,ip);
    //   }
}