package service;

import model.Material;
import storage.WriteAndReadFile;


import java.util.ArrayList;
import java.util.Collections;

public class ManagerMaterial {
    ArrayList<Material> materialList = new ArrayList<>();
    public static final String PATH_FILE = "Material.dat";

    public void addMaterial(Material material) {
        materialList.add(material);
    }

    public void writeFile() {
        WriteAndReadFile.write(materialList, PATH_FILE);
    }

    public void readFile() {
        materialList = (ArrayList<Material>) WriteAndReadFile.read(PATH_FILE);
        displayAll();
    }

    public void displayAll() {
        for (Material m : materialList) {
            System.out.println(m);
        }
    }

    public void sortMaterialsByPrice() {
        Collections.sort(materialList, (o1, o2) -> {
            if (o1.getPrice() > o2.getPrice()) return 1;
            else if (o1.getPrice() < o2.getPrice()) return -1;
            else return 0;
        });
        System.out.println(materialList);
    }

    public void showMaterialHavePriceMaxAndMin() {
        sortMaterialsByPrice();
        System.out.println("Vật liệu có giá nhỏ nhất là: " + materialList.get(0));
        System.out.println("Vật liệu có giá lớn nhất là: " + materialList.get(materialList.size() - 1));
    }

    public void removeMaterialByIndex(int index) {
        for (int i = 0; i < materialList.size(); i++) {
            if (i == index) {
                materialList.remove(i);
                return;
            }
        }
        System.out.println("index nằm ngoài danh sách vật liệu");
    }

    public void searchMaterial(String code) {
        for (Material m : materialList) {
            if (code.equalsIgnoreCase(m.getMaterialCode())) {
                System.out.println(m);
                return;
            }
        }
        System.out.println("Không có trong danh sách vật liệu");
    }


}
