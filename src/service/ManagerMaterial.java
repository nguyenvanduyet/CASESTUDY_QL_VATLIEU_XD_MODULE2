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

    }
//hiển thị danh sách vật liệu
    public void displayAll() {

    }
//sắp xếp danh sách theo giá tăng dần
    public void sortMaterialsByPrice() {

    }
// hiển thị vật liệu có giá nhỏ nhất và lớn nhất
    public void showMaterialHavePriceMaxAndMin() {

    }
//xóa vật liệu ở vị trí bất kì do người dùng nhập
    public void removeMaterialByIndex(int index) {

    }
//tìm kiếm vật liệu
    public void searchMaterial(String code){

    }


}
