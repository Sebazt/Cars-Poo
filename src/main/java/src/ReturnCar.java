package src;

public class ReturnCar extends Car{
    private String reasonReturnCar;

    public ReturnCar(String code, String brand, String model, String stateCar, String reasonReturnCar) {
        super(code, brand, model, stateCar);
        this.reasonReturnCar = reasonReturnCar;
    }

    public String getReasonReturnCar() {
        return reasonReturnCar;
    }

    public void setReasonReturnCar(String reasonReturnCar) {
        this.reasonReturnCar = reasonReturnCar;
    }
}
