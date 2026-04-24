package service;

import entity.Appointment;
import entity.Bill;
import entity.BillSummary;

public class BillService {

    public Bill generateBill(int billId, Appointment appointment) {
        double amount = appointment.getDoctor().getFee();
        return new Bill(billId, appointment, amount);
    }

    public BillSummary getSummary(Bill bill) {
        return new BillSummary(bill.hashCode(), bill.getTotal());
    }
}