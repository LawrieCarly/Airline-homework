public class Pilot {

    private CabinCrew cabinCrew;
    private String licenceNum;

    public Pilot (String licenceNum, CabinCrew cabinCrew) {
        this.cabinCrew = cabinCrew;
        this.licenceNum = licenceNum;
    }

    public String getCrewName() {
        return cabinCrew.getName();
    }

    public String getCrewRank() {
        return cabinCrew.getRank();
    }

    public String getLicenceNum() {
        return licenceNum;
    }

    public boolean canFlyPlane(CabinCrew cabinCrew){
        if ((cabinCrew == cabinCrew.isCaptain()) || (cabinCrew == cabinCrew.isFirstOfficer()) || (cabinCrew == cabinCrew.isSecondOfficer())){
            return true;
        }
        else return false;
    }

    public String isLicencedPilot(){
        if(canFlyPlane(cabinCrew)){
            return "I am a licenced Pilot";
        }
        else return "I cannot fly";
    }
}
