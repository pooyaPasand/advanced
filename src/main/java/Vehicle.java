public abstract class Vehicle  {
    //property
    int wheelsNumber;
    int doorNumbers;
    String model;
    String motorName;
    boolean isTurnedOn;
    static int numberOfSell;
    double length;
    double width;
    int petroliumLitrCount;
    //cunstructor
    Vehicle(){


    }
    //method
    public abstract boolean drive();
    public abstract String printName(Vehicle[] carNames);
    void On(){
        System.out.println("car is turn on");

        isTurnedOn=true;
    }
    void Off(){
        System.out.println("car is turn off");
        isTurnedOn=false;
    }

    }
