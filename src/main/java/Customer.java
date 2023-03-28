
public class Customer extends Vehicle {
    public static String[] topCountry= new String[10];
    static {
        topCountry[8]="iran";
    }


    public void counter(){
    Vehicle.numberOfSell++;

    }

    @Override
    public boolean drive() {
        return false;
    }

    @Override
    public String printName(Vehicle[] carNames) {
        return null;
    }
}
