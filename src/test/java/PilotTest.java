import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PilotTest {

    Pilot pilot1;
    Pilot pilot2;
    Pilot pilot3;

    @Before
    public void before(){
        pilot1 = new Pilot("749", CabinCrew.CREWMEMBER1);
        pilot2 = new Pilot("531", CabinCrew.CREWMEMBER5);
        pilot3 = new Pilot("849", CabinCrew.CREWMEMBER3);
    }

    @Test
    public void canGetCrewName(){
        assertEquals("Alex", pilot3.getCrewName());
    }

    @Test
    public void canGetCrewRank(){
        assertEquals("Captain", pilot2.getCrewRank());
    }

    @Test
    public void canGetLicenceNum(){
        assertEquals("749", pilot1.getLicenceNum());
    }

    @Test
    public void checkIfLicencedPilot(){
        assertEquals("I cannot fly", pilot1.isLicencedPilot());
    }
}
