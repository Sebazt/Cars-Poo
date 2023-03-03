package src;

public class Employee {
    private String name = "";
    private String user = "";
    private String id = "";


    public Employee(String name, String user, String id) {
        this.name = name;
        this.user = user;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getUser(){
        return user;
    }



}
