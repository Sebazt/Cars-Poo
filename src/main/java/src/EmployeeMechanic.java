package src;

public class EmployeeMechanic extends Employee{
    public EmployeeMechanic(String name, String user, String id) {
        super(name, user, id);
    }

    public String code(int code){
        return "The code of the car is: "+code;
    }

    public String repairDone(){
        return "The car is ready";
    }
}
