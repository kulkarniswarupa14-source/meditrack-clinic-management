package entity;

public class Bill {

    private int billId;
    private Appointment appointment;
    private double amount;
    private double tax;
    private double total;

    public Bill(int billId, Appointment appointment, double amount) {
        this.billId = billId;
        this.appointment = appointment;
        this.amount = amount;
        this.tax = amount * 0.18;
        this.total = amount + tax;
    }

    public void displayBill() {
        System.out.println("Bill ID: " + billId);
        System.out.println("Patient: " + appointment.getPatient().getName());
        System.out.println("Doctor: " + appointment.getDoctor().getName());
        System.out.println("Amount: " + amount);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + total);
    }

    public double getTotal() {
        return total;
    }
}