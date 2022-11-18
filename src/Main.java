import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args){
        IDevice mobile=new Mobile();
        System.out.println(mobile.getDeviceName());
        IDevice laptop= new Laptop();
        System.out.println(laptop.getDeviceName());

        mobile.deviceCalled();
        laptop.deviceCalled();
    }
}