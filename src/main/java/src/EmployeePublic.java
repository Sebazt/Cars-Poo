package src;

public class EmployeePublic extends Employee{

    public EmployeePublic(String name, String user, String id) {
        super(name, user, id);
    }

    public String searchUser(){
        return "search user with ID";
    }

    public String registerNewUser(){
        return "Validate if user exist in database with the ID";
    }

}
