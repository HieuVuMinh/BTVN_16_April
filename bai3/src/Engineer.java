public class Engineer extends Officers {
    private String majors;

    public Engineer() {
    }

    ;

    public Engineer(String name, String dateOfBirth, String gender, String address, String majors) {
        super(name, dateOfBirth, gender, address);
        this.majors = majors;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    @Override
    public String toString() {
        return "Officers{" + "name='" + getName() + '\'' + ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", Gender='" + getGender() + '\'' + ", address='" + getAddress() +
                '\'' + ", majors='" + majors + '\'' + '}';
    }
}
