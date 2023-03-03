package src;

public class OldCustomer extends EmployeePublic{

    private String addresPerson = "";

    private String profession = "";

    private int numberDriverLicense;

    public OldCustomer(String name, String user, String id, String addres, String profession, int numberDriverLicense) {
        super(name, user, id);
        this.addresPerson = addres;
        this.profession = profession;
        this.numberDriverLicense = numberDriverLicense;
    }

    public String getAddresPerson() {
        return addresPerson;
    }

    public void setAddresPerson(String addresPerson) {
        this.addresPerson = addresPerson;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getNumberDriverLicense() {
        return numberDriverLicense;
    }

    public void setNumberDriverLicense(int numberDriverLicense) {
        this.numberDriverLicense = numberDriverLicense;
    }

    public String contractFulfillment(){
        return "the contract is done";
    }
}
