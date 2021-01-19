package view;

import model.Cement;
import model.CeramicTiles;
import model.Steel;
import service.ManagerMaterial;

import java.time.LocalDate;
import java.util.Scanner;

public class TestMain {
    public static final String ENTER_MATERIAL = "Enter material";
    public static final String ENTER_MATERIAL1 = "Cement";
    public static final String ENTER_MATERIAL2 = "Ceramic";
    public static final String ENTER_MATERIAL3 = "Steel";
    public static final String ENTER_NAME = "Enter name";
    public static final String ENTER_MATERIAL_CODE = "Enter material Code";
    public static final String ENTER_PRICE = "Enter price";
    public static final String REGEX_DATE_OF_MANUFACTURE = "^[0-9]{4}\\/[0-9]{2}\\/[0-9]{2}$";
    public static final String ENTER_MANUFACTURE = "Enter manufacture";
    public static final String ENTER_MARK = "Enter mark";
    public static final String ENTER_MASS = "Enter mass";
    public static final String ENTER_SIZE = "Enter size";
    public static final String ENTER_NUMBER = "Enter number";
    public static final String ENTER_COLOR = "Enter color";
    public static final String ENTER_AFRICA = "Enter africa";
    public static final String ENTER_LENGTH = "Enter length";
    public static final String ENTER_WEIGHT = "Enter weight";
    public static final String ENTER_INDEX = "Enter Index";
    public static final String ENTER_CODE = "Enter code";
    public static final String SPACE = "_____________________________________________";

    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int ZERO = 0;
    static Scanner sc = new Scanner(System.in);
    static ManagerMaterial managerMaterial = new ManagerMaterial();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("------------Menu-----------");
            System.out.println("1. Thêm vật liệu");
            System.out.println("2. Hiển thị danh sách vật liệu");
            System.out.println("3. Sắp xếp danh sách vật liệu theo giá tăng dần");
            System.out.println("4. Hiển thị vật liệu có giá lớn nhất và nhỏ nhất");
            System.out.println("5. Xóa bất kì vật liệu ở vị trí người dùng nhập vào");
            System.out.println("6. Ghi file");
            System.out.println("7. Đọc file");
            System.out.println("8. Tìm kiếm theo mã vật liệu");
            System.out.println("0. kết thúc chương trình");
            System.out.println(" mời nhập lưa trọn");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case ONE:
                    System.out.println("nhập số lượng vật liệu");
                    int number = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < number; i++) {
                        addNew();
                    }
                    break;
                case TWO:
                    managerMaterial.displayAll();
                    break;
                case THREE:
                    managerMaterial.sortMaterialsByPrice();
                    break;
                case FOUR:
                    managerMaterial.showMaterialHavePriceMaxAndMin();
                    break;
                case FIVE:
                    removeIndex();
                    break;
                case SIX:
                    managerMaterial.writeFile();
                    break;
                case SEVEN:
                    managerMaterial.readFile();
                    break;
                case EIGHT:
                    search();
                    break;
                case ZERO:
                    System.exit(ZERO);
                    break;
            }
        } while (choice != 0);
    }

    public static void addNew() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println(ENTER_NAME);
        String name = sc.nextLine();
        System.out.println(ENTER_MATERIAL_CODE);
        String materialCode = sc1.nextLine();
        System.out.println(ENTER_PRICE);
        double price = Double.parseDouble(sc.nextLine());
        String dateManufacture;
        LocalDate dateOfManufacture = null;
        do {
            System.out.println("Nhập ngày tháng sản xuất kiểu(yyyy-MM-dd)");
            dateManufacture = sc.nextLine();
            try {
                dateOfManufacture = LocalDate.parse(dateManufacture);
            } catch (Exception e) {
            }
        } while (!dateManufacture.matches(REGEX_DATE_OF_MANUFACTURE));
        System.out.println(ENTER_MANUFACTURE);
        String manufacturer = sc1.nextLine();
        System.out.println(ENTER_MATERIAL);
        String material = sc.nextLine();
        if (material.equalsIgnoreCase(ENTER_MATERIAL1)) {
            System.out.println(ENTER_MARK);
            String mark = sc1.nextLine();
            System.out.println(ENTER_MASS);
            double mass = Double.parseDouble(sc.nextLine());
            Cement cement = new Cement(name, materialCode, price, dateOfManufacture, manufacturer, mark, mass);
            managerMaterial.addMaterial(cement);
        } else if (material.equalsIgnoreCase(ENTER_MATERIAL2)) {
            System.out.println(ENTER_SIZE);
            String size = sc1.nextLine();
            System.out.println(ENTER_NUMBER);
            double number = Double.parseDouble(sc.nextLine());
            System.out.println(ENTER_COLOR);
            String color = sc1.nextLine();
            CeramicTiles ceramicTiles = new CeramicTiles(name, materialCode, price, dateOfManufacture, manufacturer, size, number, color);
            managerMaterial.addMaterial(ceramicTiles);
        } else if (material.equalsIgnoreCase(ENTER_MATERIAL3)) {
            System.out.println(ENTER_AFRICA);
            String africa = sc.nextLine();
            System.out.println(ENTER_LENGTH);
            double length = Double.parseDouble(sc1.nextLine());
            System.out.println(ENTER_WEIGHT);
            double weight = Double.parseDouble(sc.nextLine());
            Steel steel = new Steel(name, materialCode, price, dateOfManufacture, manufacturer, africa, length, weight);
            managerMaterial.addMaterial(steel);
        }
        System.out.println(SPACE);
    }

    public static void removeIndex() {
        System.out.println(ENTER_INDEX);
        int index = Integer.parseInt(sc.nextLine());
        managerMaterial.removeMaterialByIndex(index);
    }

    public static void search() {
        System.out.println(ENTER_CODE);
        String code = sc.nextLine();
        managerMaterial.searchMaterial(code);
    }
}
