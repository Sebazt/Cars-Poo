package src;

import java.util.Date;

public class Car {
    private String code;
    private String brand;
    private String model;
    private String stateCar;
    private Date dateCarProduction;

    public Car(String code, String brand, String model, String stateCar) {
        this.code = code;
        this.brand = brand;
        this.model = model;
        this.stateCar = stateCar;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStateCar() {
        return stateCar;
    }

    public void setStateCar(String stateCar) {
        this.stateCar = stateCar;
    }

    public Date getDateCarProduction() {
        return dateCarProduction;
    }

    public void setDateCarProduction(Date dateCarProduction) {
        this.dateCarProduction = dateCarProduction;
    }

    public String description(){
        return "this is the description about car";
    }
}
