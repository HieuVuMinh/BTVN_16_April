import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonnelManagement {
    public static final String employeesPosition = "Nhập vị trí nhân viên cần thêm:";
    public static final String workerPosittion = "1. Công nhân";
    public static final String engineerPosition = "2. Kỹ sư";
    public static final String staffPosition = "3. Nhân viên";
    public static final String name = "Nhập tên: ";
    public static final String dateOfBirth = "Nhập ngày tháng năm sinh: ";
    public static final String gender = "Nhập giới tính: ";
    public static final String address = "Nhập địa chỉ: ";
    public static final String work = "Nhập công việc của nhân viên: ";
    public static final String majors = "Nhập chuyên ngành: ";
    public static final String hierarchy = "Nhập cấp bậc: ";
    public static final String notFound = "Không tìm thấy nhân viên";
    Scanner sc = new Scanner(System.in);
    List<Officers> officersList = new ArrayList<>();

    public PersonnelManagement() {
        officersList.add(new Worker("Hiếu", "16/10/1997", "male", "Hà Nội", "Bậc 1"));
        officersList.add(new Engineer("Nam", "11/12/1987", "male", "Hải phòng", "Điện máy"));
        officersList.add((new Staff("Chi", "1/2/1993", "female", "Nam Định", "Kế Toán")));
    }

    // Nhập thông tin nhân viên
    public void addEmployees() {
        System.out.println(employeesPosition);
        System.out.println(workerPosittion);
        System.out.println(engineerPosition);
        System.out.println(staffPosition);
        int selection = sc.nextInt();
        switch (selection) {
            case 1: {
                inputInfoWorker();

                break;
            }
            case 2: {
                inputInfoEngineer();
                break;
            }
            case 3: {
                inputInfoStaff();
                break;
            }
        }
    }

    private void inputInfoStaff() {
        sc.nextLine();
        System.out.println(name);
        String name = sc.nextLine();
        System.out.println(dateOfBirth);
        String dateOfBirth = sc.nextLine();
        System.out.println(gender);
        String gender = sc.nextLine();
        System.out.println(address);
        String address = sc.nextLine();
        System.out.println(work);
        String work = sc.nextLine();
        officersList.add(new Staff(name, dateOfBirth, gender, address, work));
    }

    private void inputInfoEngineer() {
        sc.nextLine();
        System.out.println(name);
        String name = sc.nextLine();
        System.out.println(dateOfBirth);
        String dateOfBirth = sc.nextLine();
        System.out.println(gender);
        String gender = sc.nextLine();
        System.out.println(address);
        String address = sc.nextLine();
        System.out.println(majors);
        String majors = sc.nextLine();
        officersList.add(new Engineer(name, dateOfBirth, gender, address, majors));
    }

    private void inputInfoWorker() {
        sc.nextLine();
        System.out.println(name);
        String name = sc.nextLine();
        System.out.println(dateOfBirth);
        String dateOfBirth = sc.nextLine();
        System.out.println(gender);
        String gender = sc.nextLine();
        System.out.println(address);
        String address = sc.nextLine();
        System.out.println(hierarchy);
        String hierarchy = sc.nextLine();
        officersList.add(new Worker(name, dateOfBirth, gender, address, hierarchy));
    }

    // Hiển thị thông tin nhân viên trong công ty
    public void displayEmployees() {
        for (int i = 0; i < officersList.size(); i++) {
            Officers employees = officersList.get(i);
            System.out.println(employees);
        }
    }

    //Tìm kiếm thông tin theo tên nhân viên
    public void findEmployees(String nameEmployees) {
        Officers officers = findEmployeesByName(nameEmployees);
        if (officers == null) {
            System.out.println(notFound);
        } else {
            System.out.println(officers);
        }
    }

    public Officers findEmployeesByName(String nameEmployees) {
        int count = -1;
        for (int i = 0; i < officersList.size(); i++) {
            Officers officers = officersList.get(i);
            String name = officers.getName();
            if (name.equals(nameEmployees)) {
                count = i;
                break;
            }
        }
        if (count == -1) {
            return null;
        }
        return officersList.get(count);
    }
}
