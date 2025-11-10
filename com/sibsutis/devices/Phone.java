package com.sibsutis.devices;
public class Phone extends device{
    public Phone(int id, int price, String ip){
        super(id, price, ip);
    }
public String getDeviceType(){
    return "Phone";
}
@Override
    public String printDevice(){
        return String.format("%d,%d,%s"+getDeviceType(),id,price,ip);
    }

}