public class ship extends Vehicle {

    @Override
    public boolean drive() {
        return false;
    }

    @Override
    public String printName(Vehicle[] carNames) {
        return this.model;
    }
}
