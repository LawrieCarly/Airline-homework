import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Flight {

    public ArrayList<Pilot> pilots;
    public CabinCrew cabinCrew;

    public ArrayList<CabinCrew> cabinCrewList;
    public ArrayList<Passenger> passengersBooked;
    public Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(CabinCrew cabinCrew, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrew = cabinCrew;
        this.passengersBooked = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.cabinCrewList = new ArrayList<CabinCrew>();
    }

    public void addPilots(Pilot pilot){
        pilots.add(pilot);
    }

    public String getPilotLicenceNumber(Pilot pilot){
        return pilot.getLicenceNum();
    }

    public void addCabinCrew(CabinCrew cabinCrew){
        cabinCrew.addFlightAttendant();
        cabinCrewList.add(cabinCrew);
    }

    public void addPassenger(Passenger passenger){
        passengersBooked.add(passenger);
    }

    public int getPassengerBags(Passenger passenger){
        return passenger.getBags();
    }

    public int getRemainingCapacity(Passenger passenger, Pilot pilot, CabinCrew cabinCrew){
        addPassenger(passenger);
        addPassenger(passenger);
        addPassenger(passenger);
        addCabinCrew(cabinCrew);
        addCabinCrew(cabinCrew);
        addPilots(pilot);
        addPilots(pilot);
        int usedCapacity =  pilots.size() + passengersBooked.size() + cabinCrewList.size();
        return plane.getCapacity();
    }

    public CabinCrew getCabinCrew() {
        return cabinCrew;
    }

    public ArrayList<Passenger> getPassengersBooked() {
        return passengersBooked;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

//    add Pilot
//    add cabinCrew
//    add passengers to array list if capacity not reached - return array list size
//    minus
//    return the capacity minus the passengerList


}
