public class Mobile implements IDevice{
    @Override
    public String getDeviceName(){
        return "This is My Mobile";
    }

    @Override
    public void deviceCalled() {
        //execute();
        System.out.println("I-device Mobile");
    }
}

