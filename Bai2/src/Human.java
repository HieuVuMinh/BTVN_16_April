import java.util.Date;

public class Human {
    private String name;
    private int day;
    private int month;
    private int year;
    private Date dateOfBirth;
    private String career;

    public Human() {
    }

    public Human(String name, int day, int month, int year, String career) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.career = career;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String displayHuman(){
        return "Họ và tên: "+ getName() + " Ngày tháng năm sinh: " + getDay() + "/" + getMonth() +
                "/" + getYear() + " Nghề nghiệp: "+getCareer() + "\n";
    }
}
