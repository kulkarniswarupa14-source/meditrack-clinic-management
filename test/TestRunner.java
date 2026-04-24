package test;

import entity.*;
import service.*;

public class TestRunner {
    public static void main(String[] args) {

        try {

            PatientService ps = new PatientService();
            DoctorService ds = new DoctorService();
            AppointmentService as = new AppointmentService();
            BillService bs = new BillService();

            Patient p = new Patient(1, "Ram", 25, "Fever");
            Doctor d = new Doctor(1, "Dr. Smith", 45, "Cardiology", 500);

            ps.addPatient(p);
            ds.addDoctor(d);

            as.createAppointment(1, p, d);
            as.cancelAppointment(1);

            ps.displayAllPatients();
            ds.displayAllDoctors();
            as.displayAppointments();

            System.out.println("Search by ID: " + ps.searchPatient(1).getName());
            System.out.println("Search by Name: " + ps.searchPatient("Ram").getName());

            // BILLING
            Appointment app = as.getAppointmentById(1);
            Bill bill = bs.generateBill(101, app);
            bill.displayBill();

            BillSummary summary = bs.getSummary(bill);
            System.out.println("Summary Total: " + summary.getTotalAmount());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}