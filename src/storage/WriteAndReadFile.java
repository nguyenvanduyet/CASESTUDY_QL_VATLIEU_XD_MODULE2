package storage;

import java.io.*;

public class WriteAndReadFile {
    public static void write(Object object, String pathFile){
        try {
            FileOutputStream fos= new FileOutputStream(pathFile);
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(object);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Object read(String pathFile){
        Object obj = null;
        try {
            FileInputStream fis= new FileInputStream(pathFile);
            ObjectInputStream ois= new ObjectInputStream(fis);
            obj =ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }


}
