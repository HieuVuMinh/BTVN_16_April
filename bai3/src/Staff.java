public class Staff extends Officers {
    private String work;

    public Staff() {
    }

    ;

    public Staff(String name, String dateOfBirth, String gender, String address, String work) {
        super(name, dateOfBirth, gender, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String toString() {
        return "Officers{" + "name='" + getName() + '\'' + ", dateOfBirth='" + getDateOfBirth() +
                '\'' + ", Gender='" + getGender() + '\'' + ", address='" + getAddress() +
                '\'' + ", work='" + work + '\'' + '}';
    }
}
