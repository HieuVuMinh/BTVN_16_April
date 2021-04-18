import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Family family = new Family();

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Nhập thêm gia đình trong khu phố");
            System.out.println("2. Hiển thị danh sách hộ gia đình");
            System.out.println("3. Hiển thị danh sách người được mừng thọ");
            System.out.println("4. Thoát");
            int selection = sc.nextInt();
            switch (selection) {
                case 1: {
                    family.inputInfoOfFamily();
                    break;
                }
                case 2: {
                    family.displayFamilyList();
                    break;
                }
                case 3: {
                    System.out.println("Nhập năm cần tính mừng thọ:");
                    int year = sc.nextInt();
                    family.longevity(year);
                }
                case 4: {
                    System.exit(0);
                }
            }
        } while (true);
    }
}
