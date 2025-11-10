import com.sibsutis.*;
import com.sibsutis.devices.*;
public class Main{
   public static void main(String[] args) {
    device devices[]={
        new Phone(4,16000,"120.16.255.78"),
        new PC(1,76000,"240.35.28.254")
    };
    for (int i=0; i<devices.length;i++){
        device thedevice=devices[i];
        System.out.println(thedevice.printDevice());
        // System.out.println(thedevice.getDeviceType()+""+thedevice.getId()+""+thedevice.getIp()+thedevice.getPrice());
    }
   }
}