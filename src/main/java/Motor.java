public class Motor extends Vehicle{
    //property
    String classModel;

    @Override
    public boolean drive() {
            if (isTurnedOn) {

                System.out.println("the car is driving");
                return true;
            } else {
                System.out.println("the car is not driving");
                return false;
            }

        }

    @Override
    public String printName(Vehicle[] carNames) {
        return null;
    }
}

