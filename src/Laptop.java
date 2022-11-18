public class Laptop implements IDevice{
    @Override
    public String getDeviceName() {
        return "This is My Laptop";
    }

    @Override
    public void deviceCalled() {
        System.out.println("I-device");
    }
}
