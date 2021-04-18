public class Worker extends Officers {
    private String hierarchy;

    public Worker() {
    }

    public Worker(String name, String dateOfBirth, String gender, String address, String hierarchy) {
        super(name, dateOfBirth, gender, address);
        this.hierarchy = hierarchy;
    }

    public String getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(String hierarchy) {
        this.hierarchy = hierarchy;
    }

    @Override
    public String toString() {
        return "Officers{" + "name='" + getName() + '\'' + ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", Gender='" + getGender() + '\'' + ", address='" + getAddress() + '\'' + ", hierarchy='"
                + hierarchy + '\'' + '}';
    }
}
