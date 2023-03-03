package src;

public class UpdateCustomer extends  OldCustomer{


    public UpdateCustomer(String name, String user, String id, String addres, String profession, int numberDriverLicense) {
        super(name, user, id, addres, profession, numberDriverLicense);
    }

    public void Update(){
        System.out.println("The customer is update");
    }
}
