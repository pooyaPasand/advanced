public class printCarModel extends Vehicle{


    @Override
    public boolean drive() {
        return false;
    }


    @Override
    public String printName(Vehicle[] names) {
        Vehicle vehicle=new Car();
        String carString="";

        for(int index=0;index<names.length;index++){
            vehicle=names[index];
            carString=carString+vehicle.model+"-";
        }
        return carString;
    }

}
