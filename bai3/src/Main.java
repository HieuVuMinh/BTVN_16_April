import java.util.Scanner;

public class Main {

    public static final String addEmployees = "1. Nhập thêm thông tin nhân viên vào nhà máy";
    public static final String displayEmployees = "2. Hiển thị thông tin nhân viên";
    public static final String findEMployees = "3. Tìm kiếm và hiển thị thông tin theo họ tên";
    public static final String exit = "4. Thoát";
    public static final String enterSelection = "Nhập lựa chọn của bạn";
    public static final String nameEmployees = "Nhập tên nhân viên muốn tìm kiếm";

    public static void main(String[] args) {
        PersonnelManagement personnelManagement = new PersonnelManagement();
        Scanner sc = new Scanner(System.in);
        do {
            int selection = getSelection(sc);

            switch (selection) {
                case 1: {
                    personnelManagement.addEmployees();
                    break;
                }
                case 2: {
                    personnelManagement.displayEmployees();
                    break;
                }
                case 3: {
                    sc.nextLine();
                    System.out.println(nameEmployees);
                    String name = sc.nextLine();
                    personnelManagement.findEmployeesByName(name);
                    break;
                }
                case 4: {
                    System.exit(0);
                }
            }
        } while (true);

    }

    private static int getSelection(Scanner sc) {
        System.out.println(addEmployees);
        System.out.println(displayEmployees);
        System.out.println(findEMployees);
        System.out.println(exit);
        System.out.println(enterSelection);
        int selection = sc.nextInt();
        return selection;
    }
}
