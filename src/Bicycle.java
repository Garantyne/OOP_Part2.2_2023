public class Bicycle extends Transport implements CheckTransport {


    public Bicycle(){
        super("Урал",2);
    }
    public Bicycle(String modelName, int wheelsCount) {
        super( modelName, wheelsCount);
    }



}