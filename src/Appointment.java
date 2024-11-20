class Appointment {
    private String patientName;
    private String mobilePhone;
    private String timeSlot;
    private HealthProfessional doctor; // This can be a GeneralPractitioner or Nutritionist

    public Appointment() {
    }

    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void printDetails() {
        System.out.println("Patient Name: " + patientName + ", Mobile Phone: " + mobilePhone + ", Time Slot: " + timeSlot);
        doctor.printDetails();
    }
}
