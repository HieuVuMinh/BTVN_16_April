public class Officers {
    private String name;
    private String dateOfBirth;
    private String Gender;
    private String address;

    public Officers(){}

    public Officers(String name, String dateOfBirth, String gender, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        Gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Officers{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", Gender='" + Gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
