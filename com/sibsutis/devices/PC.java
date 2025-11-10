package com.sibsutis.devices;
public class PC extends device{
    public PC (int id, int price, String ip){
        super(id, price, ip);
    }
public String getDeviceType(){
    return "PersonalComputer";
}
@Override
    public String printDevice(){
        return String.format("%d, %d ,%s"+" " +getDeviceType(),id,price,ip);
    }
}