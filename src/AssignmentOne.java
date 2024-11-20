import java.util.ArrayList;

public class AssignmentOne {
    // Create the main method
    public static void main(String[] args) {
        // Entry point of the Java program
        System.out.println("Hello, this is Assignment One!");

        // Part 3 – Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "General Medicine", "Family Health");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Johnson", "General Medicine", "Primary Care");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Williams", "General Medicine", "Community Health");
        Nutritionist nutritionist1 = new Nutritionist(4, "Dr. Brown", "Diet and Nutrition", "Certified Nutrition Specialist");
        Nutritionist nutritionist2 = new Nutritionist(5, "Dr. Taylor", "Public Health Nutrition", "Registered Dietitian");

        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        nutritionist1.printDetails();
        nutritionist2.printDetails();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();
        createAppointment(appointments, new Appointment("John Doe", "1234567890", "08:00", gp1));
        createAppointment(appointments, new Appointment("Jane Smith", "0987654321", "10:00", gp2));
        createAppointment(appointments, new Appointment("Alice Johnson", "1122334455", "14:30", nutritionist1));
        createAppointment(appointments, new Appointment("Bob Brown", "5566778899", "16:00", nutritionist2));

        printExistingAppointments(appointments);
        cancelBooking(appointments, "1234567890");
        printExistingAppointments(appointments);

        System.out.println("------------------------------");
    }

    public static void createAppointment(ArrayList<Appointment> appointments, Appointment appointment) {
        if (appointment != null) {
            appointments.add(appointment);
        }
    }

    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
            }
        }
    }

    public static void cancelBooking(ArrayList<Appointment> appointments, String mobilePhone) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getMobilePhone().equals(mobilePhone)) {
                appointments.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found with mobile phone: " + mobilePhone);
        }
    }
}
