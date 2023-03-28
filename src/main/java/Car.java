public class Car extends Vehicle implements Details{

        //property
        boolean isDoorOpened;
        boolean hasAlterWheel;

        //constructor
        Car(){


        }
        Car(String model){



        }
    Car(String model,boolean hasAlterWheel,String motorName){
        this.model=model;
        this.hasAlterWheel=hasAlterWheel;
        this.motorName=motorName;


    }



    //method
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
        return this.model;
    }


    void OpenTheDoor() {
            System.out.println("the door is open");
            isDoorOpened = true;
        }
        void closeTheDoor() {
            System.out.println("the door is close");
            isDoorOpened = false;

        }


    @Override
    public String motorName() {
        this.motorName=motorName;
        return this.motorName;
    }

    @Override
    public boolean hasAlterWheel() {
        return hasAlterWheel;
    }
}










