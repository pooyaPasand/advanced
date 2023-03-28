
public class Customer extends Vehicle {
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
