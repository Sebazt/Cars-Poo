package src;

public class newCustomer extends EmployeePublic{
    private String addresPerson = "";

    private String profession = "";

    private int numberDriverLicense;

    public newCustomer(String name, String user, String id, String addresPerson, String profession, int numberDriverLicense) {
        super(name, user, id);
        this.addresPerson = addresPerson;
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

    public String register(){
        return "the user is register, welcome";
    }
}
