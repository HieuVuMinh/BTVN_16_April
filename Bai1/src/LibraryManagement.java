import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagement {
    Scanner sc = new Scanner(System.in);
    List<LibraryCard> libraryCardsList = new ArrayList<>();

    public LibraryManagement() {
        libraryCardsList.add(new LibraryCard(01, 3, 1, 15, "B1",
                new Student("Hieu1", "h1", "16/10/1997", "A438")));
        libraryCardsList.add(new LibraryCard(02, 1, 2, 12, "B2",
                new Student("Hieu2", "h2", "11/1/1997", "BDN91")));
        libraryCardsList.add(new LibraryCard(03, 11, 4, 29, "B3",
                new Student("Hieu3", "h3", "1/11/1992", "A316")));
    }

    //Hàm hiển thị
    public void DisplayLibraryCard() {
        for (int i = 0; i < libraryCardsList.size(); i++) {
            LibraryCard libraryCard = libraryCardsList.get(i);
            System.out.println(libraryCard);
        }
    }

    // Nhập thông tin sinh viên
    public void addLibraryCard() {
        Student student = inpitInfoStudent();
        LibraryCard libraryCard = inputInfoLibraryCard(student);
        libraryCardsList.add(libraryCard);

    }

    private LibraryCard inputInfoLibraryCard(Student student) {
        System.out.println("Nhập mã số thẻ mượn:");
        int numberOfCard = sc.nextInt();
        System.out.println("Nhập ngày mượn:");
        int rentalDate = sc.nextInt();
        System.out.println("Nhập tháng mượn:");
        int rentalMonth = sc.nextInt();
        System.out.println("Nhập hạn trả:");
        int termDebt = sc.nextInt();
        System.out.println("Nhập mã số sách:");
        String numberOfBook = sc.nextLine();
        LibraryCard libraryCard = new LibraryCard(numberOfCard, rentalDate, rentalMonth,
                termDebt, numberOfBook, student);
        return libraryCard;
    }

    private Student inpitInfoStudent() {
        System.out.println("Nhập tên:");
        String name = sc.nextLine();
        System.out.println("Nhập mã sinh viên:");
        String id = sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh:");
        String dateOfBirth = sc.nextLine();
        System.out.println("Nhập lớp học:");
        String className = sc.nextLine();
        Student student = new Student(name, id, dateOfBirth, className);
        return student;
    }

    // Tính tên sách cần phải trả vào cuối tháng
    public void findBookExpire() {
        for (int i = 0; i < libraryCardsList.size(); i++) {
            LibraryCard libraryCard = libraryCardsList.get(i);
            int termDebt = libraryCard.getTermDebt();
            int rentalDay = libraryCard.getRentalDay();
            int rentalMonth = libraryCard.getRentalMonth();
            int numberOfCard = libraryCard.getNumberOfCard();
            String numberOfBook = libraryCard.getNumberOfBook();
            if (termDebt < 30) {
                if (rentalDay + termDebt < 30) {
                    System.out.printf("Cuốn sách có số hiệu %s, có mã thẻ %d, của học sinh có tên %s" +
                                    " sẽ hết hạn vào ngày %d tháng %d cần hoàn trả vào cuối tháng\n",
                            numberOfBook, numberOfCard, libraryCard.getStudent().getName(), rentalDay + termDebt, rentalMonth);
                }else if (rentalDay + termDebt >= 30){
                    System.out.printf("Cuốn sách có số hiệu %s, có mã thẻ %d, của học sinh có tên %s" +
                                    " sẽ hết hạn vào tháng %d cần hoàn trả vào cuối tháng\n",
                            numberOfBook, numberOfCard, libraryCard.getStudent().getName(), rentalMonth + 1);
                }
            }
        }
    }
}
