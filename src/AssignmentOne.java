import java.util.ArrayList;

public class AssignmentOne {
    // Create the main method
    public static void main(String[] args) {
        // Entry point of the Java program
        System.out.println("Hello, this is Assignment One!");

        // Part 3 – Using classes and objects
        GeneralPractitioner GP1 = new GeneralPractitioner(1, "Dr. gjs", "General Medicine", "Family Health");
        GeneralPractitioner GP2 = new GeneralPractitioner(2, "Dr. fyn", "General Medicine", "Primary Care");
        GeneralPractitioner GP3 = new GeneralPractitioner(3, "Dr. whr", "General Medicine", "Community Health");
        Nutritionist NUT1 = new Nutritionist(4, "Dr. mcs", "Diet and Nutrition", "Certified Nutrition Specialist");
        Nutritionist NUT2 = new Nutritionist(5, "Dr. jyy", "Public Health Nutrition", "Registered Dietitian");

        GP1.printDetails();
        GP2.printDetails();
        GP3.printDetails();
        NUT1.printDetails();
        NUT2.printDetails();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();
        createAppointment(appointments, new Appointment("tl", "1234567890", "08:00", GP1));
        createAppointment(appointments, new Appointment("hzl", "4352532453", "10:00", GP2));
        createAppointment(appointments, new Appointment("hck", "2131235423", "14:30", NUT1));
        createAppointment(appointments, new Appointment("bob", "8967439856", "16:00", NUT2));

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
