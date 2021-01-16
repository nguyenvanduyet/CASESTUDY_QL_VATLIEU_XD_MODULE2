package service;

import model.Material;
import storage.WriteAndReadFile;


import java.util.ArrayList;
import java.util.Collections;

public class ManagerMaterial {
    ArrayList<Material> materialList = new ArrayList<>();
    public static final String PATH_FILE="Material.dat";
// tạo phương thức thêm vật liệu
    public void addMaterial(Material material) {
        materialList.add(material);
    }
//    ghi file
    public void writeFile(){
        WriteAndReadFile.write(materialList,PATH_FILE);
    }
//    đọc file
    public void readFile(){
        materialList = (ArrayList<Material>) WriteAndReadFile.read(PATH_FILE);
        displayAll();
    }
//hiển thị danh sách vật liệu
    public void displayAll() {
        for (Material m : materialList) {
            System.out.println(m);
        }
    }
//sắp xếp danh sách theo giá tăng dần
    public void sortMaterialsByPrice() {
        Collections.sort(materialList, (o1, o2) -> {
            if (o1.getPrice() > o2.getPrice()) return 1;
            else if (o1.getPrice() < o2.getPrice()) return -1;
            else return 0;
        });
        System.out.println(materialList+"\n");
    }
// hiển thị vật liệu có giá nhỏ nhất và lớn nhất
    public void showMaterialHavePriceMaxAndMin() {

    }
//xóa vật liệu ở vị trí bất kì do người dùng nhập
    public void removeMaterialByIndex(int index) {

    }
//tìm kiếm vật liệu
    public void searchMaterial(String code){
        for (Material m:materialList){
            if (code.equalsIgnoreCase(m.getMaterialCode())){
                System.out.println(m);
                return;
            }
        }
        System.out.println("Không có trong danh sách vật liệu");
    }


}
