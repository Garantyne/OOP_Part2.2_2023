public class Car extends Transport implements CheckTransport {


    public Car(){
       super("Волга",4);
    }

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


}