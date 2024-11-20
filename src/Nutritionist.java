class Nutritionist extends HealthProfessional {
    private String certification; // Specific variable to differentiate Nutritionist

    public Nutritionist() {
    }

    public Nutritionist(int id, String name, String department, String certification) {
        super(id, name, department);
        this.certification = certification;
    }

    @Override
    public void printDetails() {
        System.out.println("Nutritionist Details:");
        super.printDetails();
        System.out.println("Certification: " + certification);
    }
}
