package src;

public class Vehicle extends Car{
    private int code;

    public Vehicle(String code, String brand, String model, String stateCar, int code1) {
        super(code, brand, model, stateCar);
        this.code = code1;
    }
}
