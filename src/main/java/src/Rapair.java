package src;

import java.util.Date;

public class Rapair extends EmployeeMechanic{

    private Date dateIn = new Date();
    private String ReasonCaryEntry = "";
    private int repairCost;
    private Date dateOut = new Date();
    private int daysFreeCar;
    private double kilometer;
    private String stateCar = "";


    public Rapair(String name, String user, String id, String reasonCaryEntry, int repairCost, int daysFreeCar, double kilometer, String stateCar) {
        super(name, user, id);
        this.ReasonCaryEntry = reasonCaryEntry;
        this.repairCost = repairCost;
        this.daysFreeCar = daysFreeCar;
        this.kilometer = kilometer;
        this.stateCar = stateCar;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public String getReasonCaryEntry() {
        return ReasonCaryEntry;
    }

    public void setReasonCaryEntry(String reasonCaryEntry) {
        ReasonCaryEntry = reasonCaryEntry;
    }

    public int getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(int repairCost) {
        this.repairCost = repairCost;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public int getDaysFreeCar() {
        return daysFreeCar;
    }

    public void setDaysFreeCar(int daysFreeCar) {
        this.daysFreeCar = daysFreeCar;
    }

    public double getKilometer() {
        return kilometer;
    }

    public void setKilometer(double kilometer) {
        this.kilometer = kilometer;
    }

    public String getStateCar() {
        return stateCar;
    }

    public void setStateCar(String stateCar) {
        this.stateCar = stateCar;
    }
}
