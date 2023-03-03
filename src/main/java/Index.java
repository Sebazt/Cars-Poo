import src.*;

public class Index {

    public static void printer(String text){

        System.out.println(text);
    }

    public static void main(String[] args) {
        String initProject = "Java run";
        printer(initProject);

        Employee personOne = new Employee("Sebastian", "pvpkings", "1020");
        printer(personOne.getName());
        printer(personOne.getUser());

        EmployeePublic personTwo = new EmployeePublic("Catalina","cata","10");
        printer(personTwo.registerNewUser());

        EmployeeMechanic personThree = new EmployeeMechanic("pablo", "Andres","1");
        printer(personThree.code(9999));

        ReturnCar car = new ReturnCar("code: 101010","Pulsar","1010","10","i don´t neeed the car in this moment");
        printer(car.getBrand());
        printer(car.getModel());
        printer(car.getReasonReturnCar());

    }
}
