class HealthProfessional {
    protected int id;
    protected String name;
    protected String department; // Basic information regardless of doctor type

    public HealthProfessional() {
    }

    public HealthProfessional(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
}
