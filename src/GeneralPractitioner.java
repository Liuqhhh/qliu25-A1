class GeneralPractitioner extends HealthProfessional {
    private String specialty; // Specific variable to differentiate General Practitioner

    public GeneralPractitioner() {
    }

    public GeneralPractitioner(int id, String name, String department, String specialty) {
        super(id, name, department);
        this.specialty = specialty;
    }

    @Override
    public void printDetails() {
        System.out.println("General Practitioner Details:");
        super.printDetails();
        System.out.println("Specialty: " + specialty);
    }
}
