public abstract class Device {
    public abstract String getDeviceName();

    protected void execute(){
        System.out.println("Nothing");
    }
    public abstract void deviceCalled();
}
