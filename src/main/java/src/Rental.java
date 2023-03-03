package src;

import java.util.Date;

public class Rental extends Car{
    private Date dateRental;
    private Date dateOutCar;
    private int daysRepairs;
    private double kilometer;
    private String stateCar;


    public Rental(String code, String brand, String model, String stateCar, Date dateRental, Date dateOutCar, int daysRepairs, double kilometer, String stateCar1) {
        super(code, brand, model, stateCar);
        this.dateRental = dateRental;
        this.dateOutCar = dateOutCar;
        this.daysRepairs = daysRepairs;
        this.kilometer = kilometer;
        this.stateCar = stateCar1;
    }
}
