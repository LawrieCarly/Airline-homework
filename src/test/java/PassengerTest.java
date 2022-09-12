import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        passenger1 = new Passenger("Paul", 2);
        passenger2 = new Passenger("Lawrie", 1);
        passenger3 = new Passenger("Shortie", 3);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Paul", passenger1.getName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(1, passenger2.getBags());
    }


}
