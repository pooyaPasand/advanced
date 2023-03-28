import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {
    @Test
    void objectTest() {
        //Given
       Vehicle motor = new Motor();
       Details car1 = new Car();

        //Then
        motor.isTurnedOn=true;
        String motorNameCar1 = car1.motorName();


        //when
Assertions.assertEquals("tu5",motorNameCar1);



    }

}
