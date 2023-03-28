import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class carSellTest {
    @Test
    void shuldTellTheNumberOfSell() {
        Customer forushande = new Customer();
        forushande.counter();
        Assertions.assertEquals(2,Vehicle.numberOfSell);

    }
}
