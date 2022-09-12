public enum CabinCrew {

    CREWMEMBER1("Stuart", "Flight Attendant"),
    CREWMEMBER2("Mhari", "Trolly Dolly"),
    CREWMEMBER3("Alex", "Second Officer"),
    CREWMEMBER4("Tracy", "First Officer"),
    CREWMEMBER5("Bruce", "Captain");

    private final String name;
    private final String rank;

    CabinCrew(String name, String rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public CabinCrew isFirstOfficer(){
        return CabinCrew.CREWMEMBER4;
    }

    public CabinCrew isSecondOfficer(){
        return CabinCrew.CREWMEMBER3;
    }

    public CabinCrew isCaptain(){
        return CabinCrew.CREWMEMBER5;
    }

    public CabinCrew addFlightAttendant(){
        return CabinCrew.CREWMEMBER1;
    }

    public CabinCrew addTrollyDolly(){
        return CabinCrew.CREWMEMBER2;
    }
}
