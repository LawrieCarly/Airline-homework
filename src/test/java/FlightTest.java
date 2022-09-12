import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Flight flight2;
    Pilot pilot1;
    Pilot pilot2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        flight1 = new Flight(CabinCrew.CREWMEMBER1, Plane.BOEING747, "540", "FRA", "EDI", "5:00");
        flight2 = new Flight(CabinCrew.CREWMEMBER5, Plane.PISTON349, "630", "USA", "GLA", "14:00");
        pilot1 = new Pilot("5759", CabinCrew.CREWMEMBER5);
        pilot2 = new Pilot("9812", CabinCrew.CREWMEMBER4);
        passenger1 = new Passenger("Lawrie", 2);
        passenger2 = new Passenger("Paul", 3);
        passenger3 = new Passenger("Shortie", 1);
    }

    @Test
    public void canAddPilot(){
        flight1.addPilots(pilot1);
        assertEquals(1, flight1.pilots.size());
    }

    @Test
    public void canGetLicenceNumber(){
        flight1.addPilots(pilot1);
        assertEquals("5759", flight1.getPilotLicenceNumber(pilot1));
    }

    @Test
    public void canAddCabinCrew(){
        flight1.addCabinCrew(CabinCrew.CREWMEMBER1);
        assertEquals("Stuart", flight1.cabinCrew.getName());
    }

    @Test
    public void canAddPassengers(){
        flight1.addPassenger(passenger1);
        assertEquals(1, flight1.passengersBooked.size());
    }

    @Test
    public void canGetPassengersBags(){
        flight1.addPassenger(passenger1);
        assertEquals(2, flight1.getPassengerBags(passenger1));
    }

    @Test
    public void canReturnRemaingSeats(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);
        flight1.addPilots(pilot1);
        flight1.addPilots(pilot2);
        flight1.addCabinCrew(CabinCrew.CREWMEMBER1);
        flight1.addCabinCrew(CabinCrew.CREWMEMBER2);
        flight1.getRemainingCapacity(passenger1, passenger2, passenger3, pilot1, pilot2, CabinCrew.CREWMEMBER1, CabinCrew.CREWMEMBER2);
    }



}
