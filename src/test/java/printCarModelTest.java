import org.junit.jupiter.api.Test;

public class printCarModelTest {
    @Test
    void shouldPrintModelNameTest() {
        Vehicle benz=new Car("benz" , true,"Automatic");
        Vehicle pride=new Car("pride" , true,"Manual");
        Vehicle ship1=new ship();
        ship1.model="ship";

        printCarModel names=new printCarModel();
        Vehicle[] vehicles={benz,pride,ship1};
        String carNames=names.printName(vehicles);
        System.out.println(carNames);



    }
}
