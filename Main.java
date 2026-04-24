import java.util.Scanner;

import entity.Patient;
import entity.Doctor;
import service.PatientService;
import service.DoctorService;
import service.AppointmentService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PatientService ps = new PatientService();
        DoctorService ds = new DoctorService();
        AppointmentService as = new AppointmentService();

        while (true) {

            System.out.println("\n1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Create Appointment");
            System.out.println("4. View Data");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Patient p = new Patient(1, "Ram", 25, "Fever");
                    ps.addPatient(p);
                    break;

                case 2:
                    Doctor d = new Doctor(1, "Dr. Smith", 40, "Cardiology", 500);
                    ds.addDoctor(d);
                    break;

                case 3:
                    as.createAppointment(1, ps.searchPatient(1), ds.getAllDoctors().get(0));
                    break;

                case 4:
                    ps.displayAllPatients();
                    ds.displayAllDoctors();
                    as.displayAppointments();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}