public class LibraryCard {
    private int numberOfCard;
    private int rentalDay;
    private int rentalMonth;
    private int termDebt;
    private String numberOfBook;
    private Student student;

    public LibraryCard(){};

    public LibraryCard(int numberOfCard, int rentalDay, int rentalMonth, int termDebt, String numberOfBook, Student student) {
        this.numberOfCard = numberOfCard;
        this.rentalDay = rentalDay;
        this.termDebt = termDebt;
        this.numberOfBook = numberOfBook;
        this.student = student;
        this.rentalMonth = rentalMonth;
    }

    public int getNumberOfCard() {
        return numberOfCard;
    }

    public void setNumberOfCard(int numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public int getRentalDay() {
        return rentalDay;
    }

    public void setRentalDay(int rentalDay) {
        this.rentalDay = rentalDay;
    }

    public int getRentalMonth() {
        return rentalMonth;
    }

    public void setRentalMonth(int rentalMonth) {
        this.rentalMonth = rentalMonth;
    }

    public int getTermDebt() {
        return termDebt;
    }

    public void setTermDebt(int termDebt) {
        this.termDebt = termDebt;
    }

    public String getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(String numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "LibraryCard{" +
                "numberOfCard=" + numberOfCard + ", rentalDay=" + rentalDay +
                ", termMonth=" + rentalMonth + " month" +
                ", termDebt=" + termDebt + " day" +
                ", numberOfBook=" + numberOfBook +
                ", " + student +
                '}';
    }
}
