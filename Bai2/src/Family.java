import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Family {
    Scanner sc = new Scanner(System.in);

    private int numberOfMember;
    private int address;
    private List<Human> humanList = new ArrayList<>();
    List<Family> familyList = new ArrayList<>();

    public Family(){}

    public Family(int numberOfMember, int address, List<Human> humanList) {
        this.numberOfMember = numberOfMember;
        this.address = address;
        this.humanList = humanList;

    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getNumberOfMember() {
        return numberOfMember;
    }

    public void setNumberOfMember(int numberOfMember) {
        this.numberOfMember = numberOfMember;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public List<Human> getHumanList() {
        return humanList;
    }

    public void setHumanList(List<Human> humanList) {
        this.humanList = humanList;
    }

    public List<Family> getFamilyList() {
        return familyList;
    }

    public void setFamilyList(List<Family> familyList) {
        this.familyList = familyList;
    }

    public void inputInfoOfFamily(){
        System.out.println("Nhập số thành viên trong gia đình: ");
        this.numberOfMember = sc.nextInt();
        System.out.println("Nhập số nhà: ");
        this.address = sc.nextInt();
        System.out.println("Nhập thông tin về các thành viên trong gia đình: ");
        for (int i = 0; i < this.numberOfMember; i++) {
            System.out.println("Nhập thành viên thứ " + (i+1) + " : ");
            sc.nextLine();
            Human human = addHuman();
            humanList.add(human);
        }
        Family family = new Family(this.numberOfMember, this.address, this.humanList);
        familyList.add(family);
    }

    // Nhập thông tin các thành viên trong gia đình
    public Human addHuman() {
        int day, month, year;
        System.out.println("Nhập tên:");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        day = sc.nextInt();
        System.out.println("Nhập tháng sinh: ");
        month = sc.nextInt();
        System.out.println("Nhập năm sinh: ");
        year = sc.nextInt();
        Date dateOfBirth =new Date (day, month, year);
        sc.nextLine();
        System.out.println("Nhập nghề nghiệp:");
        String career = sc.nextLine();
        Human human = new Human(name, day, month, year, career);
        return human;
    }

    // Hiển thị thông tin thành viên trong gia đình
    public void displayFamilyList(){
        for (int i = 0; i < familyList.size(); i++){
            System.out.println("Tên gia đình: " + (i+1));
            System.out.println("Số nhà: " + getAddress());
            System.out.println("Thông tin các thành viên trong gia đình:");
            for (int j = 0; j < humanList.size(); j++){
                System.out.println((humanList.get(j)).displayHuman());
            }
        }
    }

    public void longevity(int year){
        int isLongevity = -1;
        for (int i = 0; i < familyList.size(); i++){
            Family family = familyList.get(i);
            for (int j = 0; j < humanList.size(); j++){
                int humanYear = humanList.get(j).getYear();
                if (humanYear - year > 80){
                    isLongevity = j;
                    System.out.println("Gia đình thứ " + (i+1) + " có thành viên tên " + (humanList.get(j).getName()) +
                                        " được mừng thọ 80 tuổi");
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Family{" +
                "sc=" + sc +
                ", numberOfMember=" + numberOfMember +
                ", address=" + address + '\'' +
                ", humanList=" + humanList +
                ", familyList=" + familyList +
                '}';
    }
}
