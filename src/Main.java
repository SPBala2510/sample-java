public class Main {
    int x=25;
    public static void main(String[] args) {
        NewClass sample = new NewClass(1,14);
        System.out.println(sample.add());
        add();
        multiply(1,2,3,4,5,6,7);
        add(multiply(),4);
        System.out.println(add(2,"Kavin"));
        age(35);
        Main myObj = new Main();
        System.out.println(myObj.x);
    }


    private static void add(){
        int i =5;
        int j =10;
        System.out.println(i+j);
    }
    private static void add(int i, int j){

        int results=i+j;
        System.out.println(results);
    }

    private static String add(int o,String j){
        String Rishi = (Integer.toString(o)+' '+j) ;
        return Rishi;
    }

    private static int multiply(){
        int h=2;
        int g=2;
        int y=h*g;
        System.out.println(y);
        return(y);
    }
    private static double multiply(int h, int g, int q, int w, int e, int r, int t){
        //int y=h*g;
        float u =(h+g+q+w+(e*r))/t;
        //System.out.println(y);
        System.out.println(u);
        return(u);
    }

    private static void age(int age) {
        if (age < 18) {
            System.out.println("Access denied");
        } else {
            System.out.println("Access accepted");
        }
    }
}
